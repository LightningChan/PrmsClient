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

import com.ucas.prms.server.entity.xsd.Reply;
import com.ucas.prms.server.service.article.ArticleService;
import com.ucas.prms.server.service.article.ArticleServiceStub;
import com.ucas.prms.server.service.article.GetById;
import com.ucas.prms.server.service.article.GetByIdResponse;
import com.ucas.prms.server.service.reply.GetAllByArticleId;
import com.ucas.prms.server.service.reply.GetAllByArticleIdResponse;
import com.ucas.prms.server.service.reply.ReplyService;
import com.ucas.prms.server.service.reply.ReplyServiceStub;
import com.ucas.prms.server.service.reply.Save;

@Controller
@Scope("prototype")
public class ReplyController {
	
	@RequestMapping("/getreply")
	public ModelAndView getreply(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Long id = Long.parseLong(request.getParameter("id"));
		
		ModelAndView mv =new ModelAndView();
		ArticleService articleService = new ArticleServiceStub();
		GetById getById = new GetById();
		getById.setId(id);
		GetByIdResponse artResponse = articleService.getById(getById);
		mv.addObject("id", id);
		mv.addObject("title", artResponse.get_return().getTitle());
		mv.addObject("content", artResponse.get_return().getContent());
		
		ReplyService replyService = new ReplyServiceStub();
		GetAllByArticleId getAllByArticleId = new GetAllByArticleId();
		getAllByArticleId.setId(id);
		GetAllByArticleIdResponse replyResponse = replyService.getAllByArticleId(getAllByArticleId);
		
		List<Reply> list = Arrays.asList(replyResponse.get_return());
		
		mv.addObject("list", list);
		mv.setViewName("detail");
		return mv;
	}
	
	@RequestMapping("/addreply")
	public ModelAndView addreply(HttpServletRequest request, HttpServletResponse resp) throws Exception {
		
		String articleId =request.getParameter("id");
		HttpSession session= request.getSession();

		String authorId = (String) session.getAttribute("userid");
		String content = request.getParameter("reply");
				
		ReplyService replyService = new ReplyServiceStub();
		Save save = new Save();
		save.setContent(content);
		save.setArticleId(Long.parseLong(articleId));
		save.setAuthorId(Long.parseLong(authorId));
		replyService.save(save);
		
		ModelAndView mv =new ModelAndView("redirect:/getreply.do?id="+articleId);
		return mv;
	}
	
	
	
}
