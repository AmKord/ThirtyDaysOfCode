package com.thirtydayscode.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashSetPractice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		Set<String> st = new HashSet<>();
		String [] str = new String [input];
		for(int i=0;i<input;i++) {
			str[i] = sc.next();
		}
		
		for(int i=0;i<input;i++) {
			
			//if(!st.contains(str[i])) {
				st.add(str[i]);
			//}
			System.out.println("COunt: "+ st.size());
		}
		System.out.println(st.toString());
		
	}

}
