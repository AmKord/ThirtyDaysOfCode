package com.thirtydayscode.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class JavaParanthesisCheck extends JavaStack{
	
	public static void main(String[] args) {
		
		
		JavaParanthesisCheck jpc = new JavaParanthesisCheck();
		Stack<String> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		System.out.println(arr.toString());
		
		List<String> open = new ArrayList<>();
		open.add("{");open.add("(");open.add("[");
		
		List<String> closed = new ArrayList<>();
		closed.add("}");closed.add(")");closed.add("]");
		
		for (int i=0;i<arr.length;i++) {
			if(open.contains(String.valueOf(arr[i]))) {
				st.push(String.valueOf(arr[i]));
				System.out.println("Char: "+arr[i]);
			}
			
			else if(closed.contains(String.valueOf(arr[i]))) {
				st.pop();
				System.out.println("Char: "+arr[i]);
			}
		}
	}

}
