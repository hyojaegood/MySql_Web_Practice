package com.ssafy.edu.dao;

import java.util.List;

import com.ssafy.edu.dto.FoodDto;

public interface IFoodDao {
	public List<FoodDto> getFoodList() throws Exception;
	public void addFood(FoodDto dto) throws Exception;
	public List<FoodDto> getFoodListByName(String name) throws Exception;
	public List<FoodDto> getFoodListByManufacturer(String man) throws Exception;
	public List<FoodDto> getFoodListByMaterial(String mat) throws Exception;
	public void deleteFood(int foodNum) throws Exception;
	public void updateFood(int foodNum) throws Exception;
}
