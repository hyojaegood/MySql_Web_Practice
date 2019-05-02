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
	
	@RequestMapping(value = "login.do", 
			method = RequestMethod.POST)
	public String login(@ModelAttribute MemberDto dto,Model model, HttpSession session) throws Exception {
		logger.debug("Welcome UserController loginaf------------------! "+ dto);
		//String path="forward:/index";
		try {
			MemberDto logindto= iMemberService.userlogin(dto);
			logger.debug("Welcome UserController loginaf------------------! "+ logindto);
			if(logindto==null || logindto.getId()==null) {
				throw new Exception("아이디 체크하세요.");
			}
			session.setAttribute("id", logindto.getId());
			session.setAttribute("password", logindto.getPassword());
			session.setAttribute("name", logindto.getName());
			session.setAttribute("address", logindto.getAddress());
			session.setAttribute("email", logindto.getEmail());
			session.setAttribute("phoneNumber", logindto.getPhoneNumber());
			session.setAttribute("allergys", iMemberService.getAllergy(dto));
			session.setMaxInactiveInterval(10*60);//10분
			//System.out.println(path);
		}catch(Exception  e){
			logger.debug("Welcome UserController loginaf fail------------------! "+ new Date());
		}
		return "index";
	}	
	
	@RequestMapping(value = "logout.do", 
			method = {RequestMethod.GET,RequestMethod.POST})
	public String logout(@ModelAttribute MemberDto dto,Model model, HttpSession session) throws Exception {
		logger.debug("Welcome UserController loginaf------------------! "+ dto);
		session.invalidate();
		String path = "redirect:/start.jsp";
		return path;
	}	
	@RequestMapping(value = "signin.do", 
			method = RequestMethod.POST)
	public String signin(@ModelAttribute MemberDto dto,Model model) throws Exception {
		logger.debug("Welcome UserController loginaf------------------! "+ dto);
		//String path="forward:/index";
		try {
			iMemberService.insertMember(dto);
		}catch(Exception  e){
			logger.debug("Welcome UserController loginaf fail------------------! "+ new Date());
		}
		return "index";
	}	
	@RequestMapping(value = "change.do", 
			method = RequestMethod.POST)
	public String change(@ModelAttribute MemberDto dto,Model model, HttpSession session) throws Exception {
		logger.debug("Welcome UserController loginaf------------------! "+ dto);
		//String path="forward:/index";
		try {
			iMemberService.updateMember(dto);
			session.setAttribute("id", dto.getId());
			session.setAttribute("password", dto.getPassword());
			session.setAttribute("name", dto.getName());
			session.setAttribute("address",dto.getAddress());
			session.setAttribute("email", dto.getEmail());
			session.setAttribute("phoneNumber", dto.getPhoneNumber());
			session.setAttribute("allergys", iMemberService.getAllergy(dto));
		}catch(Exception  e){
			logger.debug("Welcome UserController loginaf fail------------------! "+ new Date());
		}
		return "index";
	}	
	@RequestMapping(value = "delete.do", 
			method = RequestMethod.POST)
	public String delete(@ModelAttribute MemberDto dto,Model model,HttpSession session) throws Exception {
		logger.debug("Welcome UserController loginaf------------------! "+ dto);
		//String path="forward:/index";
		try {
			iMemberService.deleteMember(dto);
			session.invalidate();
		}catch(Exception  e){
			logger.debug("Welcome UserController loginaf fail------------------! "+ new Date());
		}
		return "index";
	}
	
}
