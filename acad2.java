package assignment;

import java.util.Scanner;

//Assignment 4.1

//Rewrite the above code, where, inputs are provided by the user at runtime and the output is
//printed.

public class acad2 {
	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner input = new Scanner(System.in);
		System.out.println("First number is");
		number1=input.nextInt();
		System.out.println("Second number is");
		number2=input.nextInt();
		System.out.print("Sum is :");
		System.out.print(number1+number2);
		input.close();
	}
}

