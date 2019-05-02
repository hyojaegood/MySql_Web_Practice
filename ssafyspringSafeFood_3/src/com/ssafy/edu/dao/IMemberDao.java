package com.ssafy.edu.dao;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.edu.dto.AllergyItemDto;
import com.ssafy.edu.dto.IngredientDto;
import com.ssafy.edu.dto.MemberDto;

public interface IMemberDao {
	void insertMember(MemberDto dto) throws Exception;
	void updateMember(MemberDto dto) throws Exception;;
	void deleteMember(MemberDto dto) throws Exception;;
	public MemberDto userlogin(MemberDto dto) throws Exception;
	MemberDto findMemberById(MemberDto dto) throws Exception;;
	List<MemberDto> findAllMembers() throws Exception;

	void addAllergy(AllergyItemDto dto) throws Exception;
	void deleteAllergy(AllergyItemDto dto) throws Exception;
	List<AllergyItemDto> findAllAllergy() throws Exception;
	List<AllergyItemDto> findAllergyById(AllergyItemDto dto) throws Exception;
	
	List<IngredientDto> findAllIngredient() throws Exception;
	IngredientDto findIngredientbyName(IngredientDto dto) throws Exception;
	List<String> getAllergy(MemberDto dto) throws Exception;
}
