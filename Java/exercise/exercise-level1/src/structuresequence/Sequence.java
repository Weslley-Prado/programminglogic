package structuresequence;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String answer;

		do {
		System.out.println("I'm a calculator and I want to help you solve sum and other operation");

		System.out.println("Please, write the first number, operator and second number: ");
		double firstNumber = scanner.nextDouble();
		String operator = scanner.next();
		double secondNumber = scanner.nextDouble();
       
		switch (operator) {
		case "+":
			System.out.println(firstNumber + secondNumber);
			break;
		case "-":
			System.out.println(firstNumber - secondNumber);
			break;
		case "*":
			System.out.println(firstNumber * secondNumber);
			break;
		case "/":
			System.out.println(firstNumber / secondNumber);
			break;
		default:
			System.out.println("Write a value number or correct opertation");
		}
		
		System.out.println("Do you want to solve another calcule?(y/n)");
		answer = scanner.next();
		
      } while(answer == "n");
     System.out.println("Thanks to use my knowlodge about Math");
	}

}
