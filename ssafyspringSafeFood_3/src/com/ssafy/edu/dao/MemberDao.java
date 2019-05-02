package com.ssafy.edu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.dto.AllergyItemDto;
import com.ssafy.edu.dto.IngredientDto;
import com.ssafy.edu.dto.MemberDto;

@Repository
public class MemberDao implements IMemberDao {
	String ns = "com.ssafy.edu.";
	@Autowired
	private SqlSession sqlSession;
	@Override
	public void insertMember(MemberDto dto) throws Exception {
		sqlSession.insert(ns+"insertMember");
	}
	@Override
	public void updateMember(MemberDto dto) throws Exception {
		sqlSession.update(ns+"updateMember", dto);
	}
	@Override
	public void deleteMember(MemberDto dto) throws Exception {
		sqlSession.delete(ns+"deleteMember", dto);
	}
	@Override
	public MemberDto findMemberById(MemberDto dto) throws Exception {
		return sqlSession.selectOne(ns+"findMemberById", dto);
	}
	@Override
	public List<MemberDto> findAllMembers() throws Exception {
		return sqlSession.selectList(ns+"findAllMembers");
	}
	@Override
	public void addAllergy(AllergyItemDto dto) throws Exception {
		sqlSession.insert(ns+"addAllergy", dto);
	}
	@Override
	public void deleteAllergy(AllergyItemDto dto) throws Exception {
		sqlSession.delete(ns+"deleteAllergy",dto);
	}
	@Override
	public List<AllergyItemDto> findAllAllergy() throws Exception {
		return sqlSession.selectList(ns+"findAllAllergy");
	}
	@Override
	public List<AllergyItemDto> findAllergyById(AllergyItemDto dto) throws Exception {
		return sqlSession.selectList(ns+"findAllergyById", dto);
	}
	@Override
	public List<IngredientDto> findAllIngredient() throws Exception {
		return sqlSession.selectList(ns+"findAllIngredient");
	}
	@Override
	public IngredientDto findIngredientbyName(IngredientDto dto) throws Exception {
		return sqlSession.selectOne(ns+"findIngredientbyName",dto);
	}
	@Override
	public List<String> getAllergy(MemberDto dto) throws Exception {
		return sqlSession.selectList(ns+"getAllergy", dto);
	}
	@Override
	public MemberDto userlogin(MemberDto dto) throws Exception {
		return sqlSession.selectOne(ns+"userlogin",dto);
	}


}
