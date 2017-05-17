package com.ucas.prms.client.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ucas.prms.server.entity.xsd.Article;
import com.ucas.prms.server.service.article.ArticleService;
import com.ucas.prms.server.service.article.ArticleServiceStub;
import com.ucas.prms.server.service.article.Delete;
import com.ucas.prms.server.service.article.FindAll;
import com.ucas.prms.server.service.article.FindAllResponse;
import com.ucas.prms.server.service.article.Save;

@Controller
@Scope("prototype")
public class ArticleController {
	
	@RequestMapping("/toadmin")
	public ModelAndView admincontent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv =new ModelAndView();
		ArticleService articleService = new ArticleServiceStub();
		FindAll findAll = new FindAll();
		FindAllResponse allResponse = articleService.findAll(findAll);
		List<Article> list = Arrays.asList(allResponse.get_return());
		mv.addObject("list",list);
		mv.setViewName("admincontent");
		return mv;
	}
	
	@RequestMapping("/touser")
	public ModelAndView usercontent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv =new ModelAndView();
		ArticleService articleService = new ArticleServiceStub();
		FindAll findAll = new FindAll();
		FindAllResponse allResponse = articleService.findAll(findAll);
		List<Article> list = Arrays.asList(allResponse.get_return());
		mv.addObject("list",list);
		mv.setViewName("usercontent");
		return mv;
	}

	@RequestMapping("/tovisitor")
	public ModelAndView visitorcontent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv =new ModelAndView();
		ArticleService articleService = new ArticleServiceStub();
		FindAll findAll = new FindAll();
		FindAllResponse allResponse = articleService.findAll(findAll);
		List<Article> list = Arrays.asList(allResponse.get_return());
		mv.addObject("list",list);
		mv.setViewName("visitorcontent");
		return mv;
	}
	
	@RequestMapping("/addarticle")
	public ModelAndView addarticle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv =new ModelAndView();

		String title = request.getParameter("coTitle");
		String content = request.getParameter("coDesc");
		
		ArticleService articleService = new ArticleServiceStub();
		Save save = new Save();
		Article article = new Article();
		article.setTitle(title);
		article.setContent(content);
		save.setArticle(article);
		articleService.save(save);
		
		mv.addObject("msg", "新闻发布成功!");
		mv.setViewName("redirect:/toadmin.do");
		return mv;
		
	}
	
	@RequestMapping("/toaddarticle")
	public ModelAndView toaddarticle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv =new ModelAndView();
		mv.setViewName("addcontent");		
		return mv;	
	}
	
	@RequestMapping("/delarticle")
	public ModelAndView delarticle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv =new ModelAndView();
		Long id = Long.parseLong(request.getParameter("id"));
		
		ArticleService articleService=new ArticleServiceStub();
		Delete delete=new Delete();
		delete.setId(id);
		articleService.delete(delete);
		
		mv.setViewName("redirect:/toadmin.do");		
		return mv;	
	}
	
}
