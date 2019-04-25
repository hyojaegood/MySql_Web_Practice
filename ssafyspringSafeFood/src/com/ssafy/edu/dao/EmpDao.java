package com.ssafy.edu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.dto.EmpDto;

@Repository
public class EmpDao {
	String ns="com.ssafy.edu.";
	@Autowired
	private SqlSession sqlSession;
	
	public List<EmpDto> getEmplist() throws Exception{
		return sqlSession.selectList(ns+"getEmplist");
	}
}
