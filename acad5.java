package assignment;

import java.util.Scanner;

//Assignment 4.1
//5) Joe is scared to go to school. When her dad asked the reason, joe said she is unable to
//complete the task given by her teacher. The task was to find the “first 10 multiples” of the
//number entered from stdin . Eg:
//Input: 3
//O/p:
//3 x 1 = 3
//3 x 2 = 6
//………
//………
//…….
//….
//3 x 10 = 30
//Help Joe in completing the task!

public class acad5 {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Input :");
		number = input.nextInt();
		System.out.println("O/p:");
		for (int times = 1; times < 11; times++) {
			System.out.println(number + "x " + times + "=" + number * times);
		}

		input.close();
	}
}
