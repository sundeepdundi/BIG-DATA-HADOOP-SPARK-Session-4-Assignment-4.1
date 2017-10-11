package assignment;

//Assignment 4.1
//6) Write a program consisting method sum() and demonstrate the concept of method
//overloading using this method.

public class acad6 {

	//same method name with different argument
	public static int sum(int number1, int number2) {
		return number1 + number2;
	}

	public static double sum(double number1, double number2) {
		return number1 + number2;
	}

	public static void main(String[] args) {
		sum(1,2);
		sum(1.45,2.34);

	}
}
