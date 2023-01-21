package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId = 1;
	private int id;
	private String name;
	private String foodType;
	private int rating;
	
	public FoodTruck() {
		id = nextTruckId++;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String toString() {
		String output = "Food Truck name: " + name + " This food truck serves: " + foodType +
				" The rating is: " + String.valueOf(rating) + " ID: " + String.valueOf(id);
		return output;
		
	}
	
}
