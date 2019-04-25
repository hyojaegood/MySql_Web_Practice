package com.ssafy.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.edu.dao.FoodDao;
import com.ssafy.edu.dto.FoodDto;
@Service
public class FoodServiceImple implements IFoodService {
	@Autowired
	private FoodDao dao;
	@Override
	@Transactional
	public List<FoodDto> getFoodList() throws Exception {
		// TODO Auto-generated method stub
		return dao.getFoodList();
	}

	@Override
	@Transactional
	public void addFood(FoodDto dto) throws Exception {
		// TODO Auto-generated method stub
		dao.addFood(dto);
	}

	@Override
	@Transactional
	public List<FoodDto> getFoodListByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return dao.getFoodListByName(name);
	}

	@Override
	@Transactional
	public List<FoodDto> getFoodListByManufacturer(String man) throws Exception {
		// TODO Auto-generated method stub
		return dao.getFoodListByManufacturer(man);
	}

	@Override
	@Transactional
	public List<FoodDto> getFoodListByMaterial(String mat) throws Exception {
		// TODO Auto-generated method stub
		return dao.getFoodListByMaterial(mat);
	}

	@Override
	@Transactional
	public void deleteFood(int foodNum) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteFood(foodNum);
	}

	@Override
	@Transactional
	public void updateFood(int foodNum) throws Exception {
		// TODO Auto-generated method stub
		dao.updateFood(foodNum);
	}

}
