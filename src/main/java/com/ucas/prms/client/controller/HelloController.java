package com.ucas.prms.client.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ucas.prms.server.service.impl.GetById;
import com.ucas.prms.server.service.impl.GetByIdResponse;
import com.ucas.prms.server.service.impl.UserService;
import com.ucas.prms.server.service.impl.UserServiceStub;

/**
 * @Description: Test Demo for "hello world!"
 * @author:Chen Peng
 * @time:2017年5月9日 下午2:50:38
 */
@Controller
@Scope("prototype")
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) throws Exception {
		UserService userService=new UserServiceStub();
		GetById getById=new GetById();
		getById.setId(1l);
		GetByIdResponse getByIdResponse=userService.getById(getById);
		ModelAndView mv =new ModelAndView();
		mv.addObject("msg",getByIdResponse.get_return().getName());
		mv.setViewName("hello");
		return mv;
	}

}
