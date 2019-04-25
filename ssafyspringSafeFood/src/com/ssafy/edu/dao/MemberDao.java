package com.ssafy.edu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.dto.MemberDto;

@Repository
public class MemberDao implements IMemberDao {
	String ns = "com.ssafy.edu.";
	@Autowired
	private SqlSession sqlSession;
	@Override
	public List<MemberDto> getMemberlist() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getMemberlist");
	}

	@Override
	public MemberDto getUserById(String id) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(ns+"getUserById",id);
	}

	@Override
	public void addUser(MemberDto dto) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(ns+"addUser",dto);
	}

	@Override
	public void updateUser(MemberDto dto) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(ns+"updateUser",dto);
	}

	@Override
	public void deleteUser(String id) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(ns+"deleteUser",id);
	}

	@Override
	public List<MemberDto> getUserlike(String name) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getUserlike",name);
	}

	@Override
	public MemberDto userlogin(MemberDto dto) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(ns+"userlogin",dto);
	}

}