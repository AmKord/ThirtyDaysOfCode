package com.thirtydayscode.practice;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println("Array: "+ Arrays.toString(arr));
		reverseArray(arr);
	}

	
	public static void reverseArray(int[] arr) {
		int temp =0;
		
		for(int i=0; i<arr.length/2; i++) {
			
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		
			System.out.println("Reversed Array: "+ Arrays.toString(arr));
		
		
		
	}
}
