package com.ssafy.edu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.dto.AllergyItemDto;

@Repository
public class AllergyItemDao implements IAllergyItemDao {
	String ns = "com.ssafy.edu.";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<AllergyItemDto> getAllergylist() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getAllergylist");
	}

	@Override
	public void addAllergyItem(AllergyItemDto dto) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(ns+"addAllergyItem",dto);
	}

	@Override
	public List<AllergyItemDto> getAllergylistByMemeberId(String id) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getAllergylistByMemeberId",id);
	}

}
