package com.ssafy.edu.service;

import java.util.List;

import com.ssafy.edu.dto.AllergyItemDto;

public interface IAllergyItemService {
	public List<AllergyItemDto> getAllergylist() throws Exception;
	public void addAllergyItem(AllergyItemDto dto) throws Exception;
	public List<AllergyItemDto> getAllergylistByMemeberId(String id) throws Exception;
}
