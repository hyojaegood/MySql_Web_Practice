package com.ssafy.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.edu.dao.EmpDao;
import com.ssafy.edu.dto.EmpDto;
@Service
public class EmpServiceImple implements IEmpService {
	
	@Autowired
	private EmpDao empdao;
	
	@Override
	@Transactional(readOnly=true)
	public List<EmpDto> getEmplist() throws Exception {
		return empdao.getEmplist();
	}

}
