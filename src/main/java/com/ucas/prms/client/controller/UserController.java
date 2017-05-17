package com.ucas.prms.client.controller;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ucas.prms.server.entity.xsd.User;
import com.ucas.prms.server.entity.xsd.Article;
import com.ucas.prms.server.service.user.Save;
import com.ucas.prms.server.service.user.UserService;
import com.ucas.prms.server.service.user.UserServiceStub;
import com.ucas.prms.server.service.article.ArticleService;
import com.ucas.prms.server.service.article.ArticleServiceStub;
import com.ucas.prms.server.service.user.Login;
import com.ucas.prms.server.service.user.LoginResponse;
import com.ucas.prms.server.service.article.FindAll;
import com.ucas.prms.server.service.article.FindAllResponse;

@Controller
@Scope("prototype")
public class UserController {
	/**
	 * 注入JSON转换对象
	 */
	@Autowired
	private ObjectMapper objectMapper;

	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String stuName = request.getParameter("stuName");
		String stuNickname = request.getParameter("stuNickname");
		String stuPass = request.getParameter("stuPass");

		UserService userService = new UserServiceStub();
		Save save = new Save();
		User user = new User();
		user.setLoginName(stuName);
		user.setName(stuNickname);
		user.setPassword(stuPass);
		save.setUser(user);
		userService.save(save);

		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "注册成功!!");
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping("/tologin")
	public ModelAndView toLogin(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;		
	}

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		String username = req.getParameter("username").trim();
		String password = req.getParameter("password").trim();// 获取password并去掉空格

		try {
			UserService userService = new UserServiceStub();
			Login login = new Login();
			login.setLoginName(username);
			login.setPassword(password);
			LoginResponse response = userService.login(login);

			if (response.get_return() != null) {
				session.setAttribute("userid", String.valueOf(response.get_return().getId()));
				session.setAttribute("username", response.get_return().getLoginName());
				
				ArticleService articleService = new ArticleServiceStub();
				FindAll findAll = new FindAll();
				FindAllResponse allResponse = articleService.findAll(findAll);
				List<Article> list = Arrays.asList(allResponse.get_return());
				mv.addObject("list", list);
				
				if (username.equals("admin") && password.equals("admin")) {
					mv.setViewName("admincontent");
				} else {
					mv.setViewName("usercontent");
				}

			} else {
				mv.addObject("error", "用户名或密码错误!");
				mv.setViewName("login");
			}
			return mv;
		} catch (RemoteException e) {
			e.printStackTrace();
			mv.setViewName("login");
			return mv;
		}

	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		ModelAndView mv = new ModelAndView();
		req.removeAttribute("userid");
		req.removeAttribute("username");
		mv.setViewName("login");
		return mv;		
	}

}
