package com.ssafy.edu.dto;

import java.io.Serializable;

public class FoodItemDto implements Serializable{
	private int foodItemNum;//PK
	private String memberId;
	private int foodNum;
	public FoodItemDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodItemDto(int foodItemNum, String memberId, int foodNum) {
		super();
		this.foodItemNum = foodItemNum;
		this.memberId = memberId;
		this.foodNum = foodNum;
	}
	@Override
	public String toString() {
		return "FoodItemDto [foodItemNum=" + foodItemNum + ", memberId=" + memberId + ", foodNum=" + foodNum + "]";
	}
	public int getFoodItemNum() {
		return foodItemNum;
	}
	public void setFoodItemNum(int foodItemNum) {
		this.foodItemNum = foodItemNum;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getFoodNum() {
		return foodNum;
	}
	public void setFoodNum(int foodNum) {
		this.foodNum = foodNum;
	}
	
}
