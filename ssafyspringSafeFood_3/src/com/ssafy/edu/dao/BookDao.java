package com.ssafy.edu.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.dto.BookDto;

@Repository
public class BookDao {
	String ns="com.ssafy.edu.";
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<BookDto> getBooklist() throws Exception{
		return sqlSession.selectList(ns+"getBooklist");
	}
	
	public void addBook(BookDto b)throws Exception{
		 sqlSession.insert(ns+"addBook",b);
	}

	public List<BookDto>  searchBook(HashMap<String, String> bookMap)throws Exception {
		return sqlSession.selectList(ns+"searchBook",bookMap);
	}
	
	
	
}
