package com.groupProject.Aug14;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */
		int[][] numbers = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },

		};

		System.out.println("The Even numbers from the given array are:");
		int even = 0;
		int odd = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					even = numbers[i][j];
					System.out.print(even + " ");

				}

			}
		}
	}
}
