package com.ssafy.edu.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssafy.edu.service.IFoodService;
import com.ssafy.edu.service.IMemberService;

@Controller
public class FoodController {
	private static final Logger logger = 
			LoggerFactory.getLogger(AllergyItemController.class);
	@Autowired
	private IFoodService iFoodService;
	@Autowired
	private IMemberService iMemberService;
	
	
	@RequestMapping(value = "index.do", 
			method = {RequestMethod.GET,RequestMethod.POST})
	public String foodlist(Model model) throws Exception {
		logger.debug("Welcome FoodController foodlist! "+ new Date());
		model.addAttribute("foods", iFoodService.getFoodList() );
		model.addAttribute("ingredients", iMemberService.findAllIngredient());
		System.out.println(iFoodService.getFoodList());
		System.out.println("AAAAA");
		return "index";
	}
}