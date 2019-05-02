package com.ssafy.edu.dto;

import java.io.Serializable;

public class IngredientDto implements Serializable {
	private int Inum;
	private String name;
	
	public IngredientDto() {
		super();
	}

	public IngredientDto(int inum, String name) {
		super();
		Inum = inum;
		this.name = name;
	}

	public int getInum() {
		return Inum;
	}

	public void setInum(int inum) {
		Inum = inum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ingredient [Inum=" + Inum + ", name=" + name + "]";
	}
	
	
}
