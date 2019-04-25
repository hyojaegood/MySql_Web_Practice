package com.ssafy.edu.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssafy.edu.dto.MemberDto;
import com.ssafy.edu.service.IMemberService;
@Controller
public class MemberController {
	private static final Logger logger = 
			LoggerFactory.getLogger(AllergyItemController.class);
	@Autowired
	private IMemberService iMemberService;
	@RequestMapping(value = "loginbf.do", 
			method = {RequestMethod.GET,RequestMethod.POST})
	public String loginbf(@ModelAttribute MemberDto userdto,Model model) throws Exception {
		logger.debug("Welcome UserController loginbf------------------! "+ new Date());
		return "login";
	}
	@RequestMapping(value = "loginaf.do", 
			method = RequestMethod.POST)
	public String loginaf(@ModelAttribute MemberDto dto,Model model, HttpSession session) throws Exception {
		logger.debug("Welcome UserController loginaf------------------! "+ dto);
		String path="forward:/";
		try {
			MemberDto logindto= iMemberService.userlogin(dto);
			logger.debug("Welcome UserController loginaf------------------! "+ logindto);
			if(logindto==null || logindto.getId()==null) {
				throw new Exception("아이디 체크하세요.");
			}
			session.setAttribute("login", logindto);
			session.setMaxInactiveInterval(10*60);//10분
			path="hello";
			System.out.println(path);
		}catch(Exception  e){
			path="redirect:/loginbf.do";//로그인 실패 시 로그인 페이지로 이동
			logger.debug("Welcome UserController loginaf fail------------------! "+ new Date());
		}

		return path;
	}	
}