package assignment;

import java.util.Scanner;
////Assignment 4.1
//3) Write a program with method name sum() that accepts two parameters from user and print
//the sum of two numbers. Output format should be as:
//First number is:
//Second number is:
//Sum is:

public class acad3 {
	public static int sum(int number1, int number2) {
		return number1 + number2;
	}

	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner input = new Scanner(System.in);
		System.out.println("First number is");
		number1 = input.nextInt();
		System.out.println("Second number is");
		number2 = input.nextInt();
		System.out.print("Sum is :");
		System.out.print(sum(number1, number2));
		input.close();
	}
}
