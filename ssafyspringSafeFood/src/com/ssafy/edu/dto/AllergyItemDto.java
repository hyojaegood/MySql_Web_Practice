package com.ssafy.edu.dto;

import java.io.Serializable;

public class AllergyItemDto implements Serializable{
	private String memberId;//pk
	private String ingredient;//pk
	public AllergyItemDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllergyItemDto(String memberId, String ingredient) {
		super();
		this.memberId = memberId;
		this.ingredient = ingredient;
	}
	@Override
	public String toString() {
		return "AllergyItemDto [memberId=" + memberId + ", ingredient=" + ingredient + "]";
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
}
