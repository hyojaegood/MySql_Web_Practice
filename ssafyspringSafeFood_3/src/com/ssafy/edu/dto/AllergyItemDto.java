package com.ssafy.edu.dto;

import java.io.Serializable;

public class AllergyItemDto implements Serializable{
	private String id;//pk
	private int Inum;//pk
	public AllergyItemDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllergyItemDto(String id, int inum) {
		super();
		this.id = id;
		Inum = inum;
	}
	@Override
	public String toString() {
		return "AllergyItemDto [id=" + id + ", Inum=" + Inum + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getInum() {
		return Inum;
	}
	public void setInum(int inum) {
		Inum = inum;
	}
	
}
