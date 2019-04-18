package com.ssafy.edu.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ssafy.edu.dto.FoodDto;

public class FoodDaoImpl {
	private Map<Integer, FoodDto> foods= new HashMap<Integer, FoodDto>();
	public static void main(String[] args){
		FoodDaoImpl test = new FoodDaoImpl();
	}
	public FoodDaoImpl() {
		//데이터베이스에서 값을 가져옴
	}
}
