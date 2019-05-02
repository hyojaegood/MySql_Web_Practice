package com.ssafy.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.edu.dao.MemberDao;
import com.ssafy.edu.dto.AllergyItemDto;
import com.ssafy.edu.dto.IngredientDto;
import com.ssafy.edu.dto.MemberDto;

@Service
public class MemberServiceImple implements IMemberService {
	
	@Autowired
	private MemberDao dao;

	@Override
	@Transactional
	public void insertMember(MemberDto dto) throws Exception {
		dao.insertMember(dto);
	}

	@Override
	@Transactional
	public void updateMember(MemberDto dto) throws Exception {
		dao.updateMember(dto);
	}

	@Override
	@Transactional
	public void deleteMember(MemberDto dto) throws Exception {
		dao.deleteMember(dto);		
	}

	@Override
	@Transactional
	public MemberDto findMemberById(MemberDto dto) throws Exception {
		return dao.findMemberById(dto);
	}

	@Override
	@Transactional
	public List<MemberDto> findAllMembers() throws Exception {
		return dao.findAllMembers();
	}

	@Override
	@Transactional
	public void addAllergy(AllergyItemDto dto) throws Exception {
		dao.addAllergy(dto);
	}

	@Override
	@Transactional
	public void deleteAllergy(AllergyItemDto dto) throws Exception {
		dao.deleteAllergy(dto);
	}

	@Override
	@Transactional
	public List<AllergyItemDto> findAllAllergy() throws Exception {
		return dao.findAllAllergy();
	}

	@Override
	@Transactional
	public List<AllergyItemDto> findAllergyById(AllergyItemDto dto) throws Exception {
		return dao.findAllergyById(dto);
	}

	@Override
	@Transactional
	public List<IngredientDto> findAllIngredient() throws Exception {
		return dao.findAllIngredient();
	}

	@Override
	@Transactional
	public IngredientDto findIngredientbyName(IngredientDto dto) throws Exception {
		return dao.findIngredientbyName(dto);
	}

	@Override
	@Transactional
	public List<String> getAllergy(MemberDto dto) throws Exception {
		return dao.getAllergy(dto);
	}

	@Override
	public MemberDto userlogin(MemberDto dto) throws Exception {
		return dao.userlogin(dto);
	}

}
