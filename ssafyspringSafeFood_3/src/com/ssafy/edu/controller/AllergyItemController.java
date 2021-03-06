package com.ssafy.edu.controller;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.service.IAllergyItemService;

@Controller
public class AllergyItemController {
	private static final Logger logger = 
			LoggerFactory.getLogger(AllergyItemController.class);
	@Autowired
	private IAllergyItemService iAllergyItemService;
}
