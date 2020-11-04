package com.thirtydayscode.practice;

import java.util.Scanner;

public class MinimumElement {
	
	public static void main(String[] args) {
		
		//System.out.println(readIntegers(5));
		findMin(readIntegers(5));
	}
	
	public static int[] readIntegers(int count) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[count];
		int i=0;
		while(i!=count) {
			arr[i] = sc.nextInt();			
			i++;
		}
		return arr;
		
	}
	
	public static int findMin(int[] arr) {
		int temp = Integer.MAX_VALUE;
		
		for (int i=0; i<arr.length;i++) {
			
			if(arr[i]<=temp) {
				temp = arr[i];
			}
			System.out.println(arr[i]);
			
		}
		System.out.println("Return Value: "+temp);
		return temp;
	}

}
