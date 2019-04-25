package com.ssafy.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.edu.dao.MemberDao;
import com.ssafy.edu.dto.MemberDto;

@Service
public class MemberServiceImple implements IMemberService {
	
	@Autowired
	private MemberDao dao;
	@Override
	@Transactional
	public List<MemberDto> getMemberlist() throws Exception {
		// TODO Auto-generated method stub
		return dao.getMemberlist();
	}

	@Override
	@Transactional
	public MemberDto getUserById(String id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getUserById(id);
	}

	@Override
	@Transactional
	public void addUser(MemberDto dto) throws Exception {
		// TODO Auto-generated method stub
		dao.addUser(dto);
	}

	@Override
	@Transactional
	public void updateUser(MemberDto dto) throws Exception {
		// TODO Auto-generated method stub
		dao.updateUser(dto);
	}

	@Override
	@Transactional
	public void deleteUser(String id) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteUser(id);
	}

	@Override
	@Transactional
	public List<MemberDto> getUserlike(String name) throws Exception {
		// TODO Auto-generated method stub
		return dao.getUserlike(name);
	}

	@Override
	@Transactional
	public MemberDto userlogin(MemberDto dto) throws Exception {
		// TODO Auto-generated method stub
		return dao.userlogin(dto);
	}

}