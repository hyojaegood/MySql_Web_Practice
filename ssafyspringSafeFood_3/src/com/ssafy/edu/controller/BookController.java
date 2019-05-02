package com.ssafy.edu.controller;

import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssafy.edu.service.IBookService;
import com.ssafy.edu.service.IEmpService;


@Controller
public class BookController {

	private static final Logger logger = 
			LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	private IBookService iBookService;
	
	@RequestMapping(value = "booklist.do", 
			method = RequestMethod.GET)
	public String booklist(Model model) throws Exception {
		logger.debug("Welcome HelloController booklist! "+ new Date());
		
		model.addAttribute("booklist", iBookService.getBooklist() );
		
		return "booklist";
	}//	
	@RequestMapping(value = "search.do", 
			method = RequestMethod.POST)
	public String search(String s_category,String s_keyword,Model model) throws Exception {
		HashMap<String, String> bookMap=new HashMap<>();
		bookMap.put("s_category", s_category);
		bookMap.put("s_keyword", s_keyword);
		logger.debug("Welcome HelloController search! "+ new Date());
		logger.debug("Welcome HelloController search! "+ bookMap+"----------------");
		model.addAttribute("booklist", iBookService.searchBook(bookMap));
		
		return "booklist";
	}//	
	
	//s_keyword
	//s_category
}
