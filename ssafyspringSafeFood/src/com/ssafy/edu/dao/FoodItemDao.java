package com.ssafy.edu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.dto.FoodDto;
import com.ssafy.edu.dto.FoodItemDto;

@Repository
public class FoodItemDao implements IFoodItemDao {
	String ns = "com.ssafy.edu.";
	@Autowired
	private SqlSession sqlSession;
	@Override
	public List<FoodItemDto> getFoodItemList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getFoodItemList");
	}

	@Override
	public void addFoodItem(FoodDto dto) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(ns+"addFoodItem",dto);
	}

	@Override
	public List<FoodItemDto> getFoodItemListByMemberId(String id) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getFoodItemListByMemberId",id);
	}

	@Override
	public void deleteFood(int foodNum) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(ns+"deleteFood",foodNum);
	}

}
