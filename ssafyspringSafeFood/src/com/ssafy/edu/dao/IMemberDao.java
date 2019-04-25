package com.ssafy.edu.dao;

import java.util.List;

import com.ssafy.edu.dto.MemberDto;

public interface IMemberDao {
	public List<MemberDto> getMemberlist() throws Exception;
	public MemberDto getUserById(String id) throws Exception;
	public void addUser(MemberDto dto)throws Exception;
	public void updateUser(MemberDto dto)throws Exception;
	public void deleteUser(String id)throws Exception;
	public List<MemberDto> getUserlike(String name) throws Exception;
	public MemberDto userlogin(MemberDto dto) throws Exception;
}
