package com.ssafy.edu.dao;

import java.util.List;

import com.ssafy.edu.dto.FoodDto;
import com.ssafy.edu.dto.FoodItemDto;

public interface IFoodItemDao {
	public List<FoodItemDto> getFoodItemList() throws Exception;
	public void addFoodItem(FoodDto dto) throws Exception;
	public List<FoodItemDto> getFoodItemListByMemberId(String id) throws Exception;
	public void deleteFood(int foodNum) throws Exception;
}
