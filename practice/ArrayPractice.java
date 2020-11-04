package com.thirtydayscode.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayPractice {
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int[] arr = getIntegers(sc);
		printArray(arr);
		sortIntegers(arr);
		printArray(arr);
	}
	
	
	public static int[] getIntegers(Scanner sc) {
		
		System.out.println("Enter the size:");
		int arrSize = sc.nextInt();
		System.out.println("Enter the numbers:");
		int[] arr = new int[arrSize];
		for(int i=0;i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr) {
		System.out.println("Numbers Are:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(i+1 +"."+arr[i]);
		}
		
	}
	
	public static int[] sortIntegers(int[] arr) {
		
		
		Arrays.sort(arr);
		return arr;
		
	}

}
