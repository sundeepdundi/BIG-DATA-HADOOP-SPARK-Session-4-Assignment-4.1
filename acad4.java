package assignment;

import java.util.Scanner;

//Assignment 4.1
//4) Write a program to accepts two numbers from stdin and find all the odd as well as even
//numbers present in between them.

public class acad4 {

	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner input = new Scanner(System.in);
		System.out.println("First number is");
		number1 = input.nextInt();
		System.out.println("Second number is");
		number2 = input.nextInt();
		System.out.print("Odd numbers between number " + number1 + " and " + number2 + " are \t");
		int currentNumber = number1 + 1;
		while (currentNumber < number2) {
			if (currentNumber % 2 != 0) {
				System.out.print(currentNumber + " ");
			}
			currentNumber++;
		}
		System.out.print("\nEven numbers between number " + number1 + " and " + number2 + " are \t");
		currentNumber = number1 + 1;
		while (currentNumber < number2) {
			if (currentNumber % 2 == 0) {
				System.out.print(currentNumber + " ");
			}
			currentNumber++;
		}
		input.close();
	}
}
