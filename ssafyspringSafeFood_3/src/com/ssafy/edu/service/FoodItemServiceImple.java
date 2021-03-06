package com.ssafy.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.edu.dao.FoodItemDao;
import com.ssafy.edu.dto.FoodDto;
import com.ssafy.edu.dto.FoodItemDto;
@Service
public class FoodItemServiceImple implements IFoodItemService {
	
	@Autowired
	private FoodItemDao dao;
	@Override
	@Transactional
	public List<FoodItemDto> getFoodItemList() throws Exception {
		// TODO Auto-generated method stub
		return dao.getFoodItemList();
	}

	@Override
	@Transactional
	public void addFoodItem(FoodDto dto) throws Exception {
		// TODO Auto-generated method stub
		dao.addFoodItem(dto);
	}

	@Override
	@Transactional
	public List<FoodItemDto> getFoodItemListByMemberId(String id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getFoodItemListByMemberId(id);
	}

	@Override
	@Transactional
	public void deleteFood(int foodNum) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteFood(foodNum);
	}

}
