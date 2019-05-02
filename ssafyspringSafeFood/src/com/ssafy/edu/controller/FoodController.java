package com.ssafy.edu.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssafy.edu.dto.FoodDto;
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
	public String index(Model model) throws Exception {
		logger.debug("Welcome FoodController index! "+ new Date());
		model.addAttribute("foods", iFoodService.getFoodList() );
		model.addAttribute("ingredients", iMemberService.findAllIngredient());
		System.out.println(iFoodService.getFoodList());
		return "index";
	}
	
	@RequestMapping(value = "service.do", 
			method = {RequestMethod.GET,RequestMethod.POST})
	public String service(Model model, HttpServletRequest httpServletRequest) throws Exception {
		logger.debug("Welcome FoodController service! "+ new Date());
		String keyword = httpServletRequest.getParameter("keyword");
		Map<Integer, FoodDto> result = new HashMap<>();
		if(keyword!=null) {
			for(FoodDto f:iFoodService.getFoodListByManufacturer(keyword)) {
				result.put(f.getFoodNum(), f);
			}
			for(FoodDto f:iFoodService.getFoodListByMaterial(keyword)) {
				result.put(f.getFoodNum(), f);
			}
			for(FoodDto f:iFoodService.getFoodListByName(keyword)) {
				result.put(f.getFoodNum(), f);
			}
			System.out.println("keyword!~~~~");
			List<FoodDto> list = new ArrayList(result.values());
			model.addAttribute("foods", list);
			System.out.println(list);
		}else {
			model.addAttribute("foods", iFoodService.getFoodList());
			System.out.println(iFoodService.getFoodList());	
		}
		return "service";
	}
	
	@RequestMapping(value = "detail.do", 
			method = {RequestMethod.GET,RequestMethod.POST})
	public String detail(Model model, HttpServletRequest httpServletRequest) throws Exception {
		logger.debug("Welcome FoodController detail! "+ new Date());
		String name = httpServletRequest.getParameter("name");
		List<FoodDto> list = iFoodService.getFoodListByName(name);
		FoodDto dto = list.get(0);
		model.addAttribute("food",dto );
		return "details";
	}
	@RequestMapping(value = "about.do", 
			method = {RequestMethod.GET,RequestMethod.POST})
	public String about(Model model) throws Exception {
		logger.debug("Welcome FoodController about! "+ new Date());
		return "about";
	}
}
