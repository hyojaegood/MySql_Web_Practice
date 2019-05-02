package com.ssafy.edu.service;

import java.util.List;

import com.ssafy.edu.dto.EmpDto;

public interface IEmpService {
	public List<EmpDto> getEmplist() throws Exception;
}
