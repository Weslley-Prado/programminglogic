package com.password;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int senha;

		do {
			System.out.println("To acess the programming, please type the password: ");
			senha = sc.nextInt();
			if(senha != 2002) {
				System.out.println("Password invalid! Try again!");
			}		

		} while(senha != 2002);
		System.out.println("Acess confirmed");
	}
}
