package com.negativeandpositive;

import java.util.Scanner;

public class NegativeAndPositive {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("This is programming says if a number is negative or positive: ");
		double number = sc.nextDouble();
		
		if(number < 0) {
			System.out.println("This is a number is negative");
		}else {
			System.out.println("This is a number positive");
		}
		
	}

}
