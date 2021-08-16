package com.groupProject.Aug14;

public class Task6 {

	public static void main(String[] args) {
		// #6: Write a Java Program to print the first 10 numbers of Fibonacci series.

		int number1 = 0, number2 = 1, number3;

		System.out.print(number1 + " " + number2);// printing 0 and 1

		for (int i = 2; i < 10; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			number3 = number1 + number2;
			System.out.print(" " + number3);
			number1 = number2;
			number2 = number3;
		}
	}

}