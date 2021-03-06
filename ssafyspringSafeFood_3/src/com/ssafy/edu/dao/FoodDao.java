package com.ssafy.edu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.dto.FoodDto;


@Repository
public class FoodDao implements IFoodDao {
	String ns = "com.ssafy.edu.";
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<FoodDto> getFoodList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getFoodList");
	}

	@Override
	public void addFood(FoodDto dto) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(ns+"addFood",dto);
	}

	@Override
	public List<FoodDto> getFoodListByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getFoodListByName",name);
	}

	@Override
	public List<FoodDto> getFoodListByManufacturer(String man) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getFoodListByManufacturer",man);
	}

	@Override
	public List<FoodDto> getFoodListByMaterial(String mat) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getFoodListByMaterial",mat);
	}

	@Override
	public void deleteFood(int foodNum) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(ns+"deleteFood",foodNum);
	}

	@Override
	public void updateFood(int foodNum) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(ns+"updateFood",foodNum);
	}

}
