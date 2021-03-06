package com.ssafy.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.edu.dao.AllergyItemDao;
import com.ssafy.edu.dto.AllergyItemDto;

@Service
public class AllergyItemServiceImple implements IAllergyItemService {
	
	@Autowired
	private AllergyItemDao dao;
	@Override
	@Transactional
	public List<AllergyItemDto> getAllergylist() throws Exception {
		// TODO Auto-generated method stub
		return dao.getAllergylist();
	}

	@Override
	@Transactional
	public void addAllergyItem(AllergyItemDto dto) throws Exception {
		// TODO Auto-generated method stub
		dao.addAllergyItem(dto);
	}

	@Override
	@Transactional
	public List<AllergyItemDto> getAllergylistByMemeberId(String id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getAllergylistByMemeberId(id);
	}

}
