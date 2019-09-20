package main;

import java.util.*;

public class BMI {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int units;
		double weight;
		double height;
		double bmi;
		
		System.out.println("Enter 1 for imperial, or 2 for metric units.");
		units = scnr.nextInt();
		
		if (units == 1) {
			System.out.println("Enter height in inches.");
			height = scnr.nextInt();
			System.out.println("Enter weight in pounds.");
			weight = scnr.nextInt();
			bmi = ((703 * weight)/(height * height));
			System.out.println("BMI = " + bmi + ".");
			if (bmi < 18.5) {
	            System.out.println("Underweight");
	        } 
			else if (bmi < 25) {
	            System.out.println("Normal");
	        } 
			else if (bmi < 30) {
	            System.out.println("Overweight");
	        } 
			else {
	            System.out.println("Obese");
	        }
		}
		else if (units == 2) {
			System.out.println("Enter height in meters.");
			height = scnr.nextInt();
			System.out.println("Enter weight in kilograms.");
			weight = scnr.nextInt();
			bmi = (weight/(height * height));
			System.out.println("BMI = " + bmi + ".");
			if (bmi < 18.5) {
	            System.out.println("Underweight");
	        } 
			else if (bmi < 25) {
	            System.out.println("Normal");
	        } 
			else if (bmi < 30) {
	            System.out.println("Overweight");
	        } 
			else {
	            System.out.println("Obese");
	        }
		}
		else {
			System.out.println("Please enter either 1 or 2.");
		}
		
	}
	
	
}
