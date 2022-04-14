package com.areatriqangle;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of the triangles x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println(areaX);
		System.out.println(areaY);
	}

}
