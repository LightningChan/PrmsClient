package com.ucas.prms.client.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ucas.prms.server.entity.xsd.User;
import com.ucas.prms.server.service.user.GetById;
import com.ucas.prms.server.service.user.GetByIdResponse;
import com.ucas.prms.server.service.user.UserService;
import com.ucas.prms.server.service.user.UserServiceStub;

/**
 * @Description: Test Demo for "hello world!"
 * @author:Chen Peng
 * @time:2017年5月9日 下午2:50:38
 */
@Controller
@Scope("prototype")
public class HelloController {
	
	/**
	 * 日志
	 */
	private Logger logger = Logger.getLogger(this.getClass());
	
	/**
	 * 注入JSON转换对象
	 */
	@Autowired
	private ObjectMapper objectMapper;


	@RequestMapping("/hello")
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//调用UserService的getbyID
		UserService userService=new UserServiceStub();
		GetById getById=new GetById();
		getById.setId(1l);
		GetByIdResponse getByIdResponse=userService.getById(getById);
		
		User user=new User();
		user.setId(getByIdResponse.get_return().getId());
		user.setName(getByIdResponse.get_return().getName());
		user.setLoginName(getByIdResponse.get_return().getLoginName());
		
		//转换成json字符串
		String jsonStr=objectMapper.writeValueAsString(user);
		System.out.println(jsonStr);
		ModelAndView mv =new ModelAndView();
		mv.addObject("msg",jsonStr);
		mv.setViewName("hello");
		return mv;
	}

}
