package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private static FoodTruck[] fleet;

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		fleet = new FoodTruck[5];
		for (int i = 0; i < 5; i++) {
			FoodTruck foodTruck = new FoodTruck();
			System.out.print("Enter a food truck name: ");
			String name = kb.next();
			if (name.equals("quit")) {
				break;
			}
			System.out.print("Enter a food type: ");
			String food = kb.next();
			System.out.print("Enter the food truck's rating: ");
			int rating = kb.nextInt();

			foodTruck.setName(name);
			foodTruck.setFoodType(food);
			foodTruck.setRating(rating);

			fleet[i] = foodTruck;

		}
		boolean loopForever = true;
		while (loopForever) {
			printMenu();
			int userOption = kb.nextInt();
			if (userOption == 1) {
				displayFoodTrucks();
			}
			if (userOption == 2) {
				displayAverage();
			}
			if (userOption == 3) {
				displayHighestRating();
			}
			if (userOption == 4) {
				quitter();
				loopForever = false;
			}
		}
		kb.close();
	}

	public static void printMenu() {
		System.out.println("===================================");
		System.out.println("1. List all food trucks");
		System.out.println("2. Display average rated food truck");
		System.out.println("3. Display highest rated food truck");
		System.out.println("4. Quit");
		System.out.println("===================================");
		System.out.print("Select an option: ");
	}

	public static void displayFoodTrucks() {
		for (int i = 0; i < 5; i++) {
			if (fleet[i] == null) {
				break;
			}
			System.out.println(fleet[i].toString());
		}
	}

	public static void displayAverage() {
		float sumRatings = 0;
		int i;
		for (i = 0; i < 5; i++) {
			if (fleet[i] == null) {
				break;
			}
			int rating = fleet[i].getRating();
			sumRatings += rating;
		}
		System.out.println("The average rating is " + (sumRatings / i));
	}

	public static void displayHighestRating() {
		int i;
		int max = 0;
		for (i = 0; i < 5; i++) {
			if (fleet[i] == null) {
				break;
			}
			if (fleet[i].getRating() > max) {
				max = fleet[i].getRating();
			}
		}
		System.out.println("The max rating is " + max);
	}

	public static void quitter() {
		System.out.println("Quitter!");
	}
}
