package com.groupProject.Aug14;

public class Task4 {

	public static void main(String[] args) {
		// Swap 2 numbers without a temporary variable

		int a = 2;
		int b = 1;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Result is a=" + a + " and b=" + b);

	}

}
