package com.ssafy.edu.dto;

import java.io.Serializable;

public class FoodItemDto implements Serializable{
	private int foodItemNum;//PK
	private String memberId;
	private int foodNum;
	private String date;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public FoodItemDto(int foodItemNum, String memberId, int foodNum, String date) {
		super();
		this.foodItemNum = foodItemNum;
		this.memberId = memberId;
		this.foodNum = foodNum;
		this.date = date;
	}
	@Override
	public String toString() {
		return "FoodItemDto [foodItemNum=" + foodItemNum + ", memberId=" + memberId + ", foodNum=" + foodNum + ", date="
				+ date + "]";
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
