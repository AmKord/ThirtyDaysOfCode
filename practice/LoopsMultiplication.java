package com.thirtydayscode.practice;

public class LoopsMultiplication {

	public static void main(String[] args) {

		int n = 2;
		int loop = 10;
		String one = "Hackerr";
		String two = "Rankr";
		char[] oneC = one.toCharArray();
		System.out.println(one.length() + "" + oneC.length);

		int i = 0;
		while (i < one.length()) {

			System.out.print(oneC[i]);
			i = i + 2;

		}
		System.out.print(" ");
		int j = 1;
		while (j < one.length()) {

			System.out.print(oneC[j]);
			j = j + 2;

		}

	}

}
