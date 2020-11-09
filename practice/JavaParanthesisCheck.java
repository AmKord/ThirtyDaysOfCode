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
		open.add("{");
		open.add("(");
		open.add("[");
		
		List<String> closed = new ArrayList<>();
		closed.add("}");
		closed.add(")");
		closed.add("]");
		
	    boolean flag = true;
		
	    for (int i=0;i<arr.length;i++) {
			System.out.println("STACK: "+st.toString());
			if (open.contains(String.valueOf(arr[i]))) {
				st.push(String.valueOf(arr[i]));
				//System.out.println("Char Open: " + arr[i]);
			}

			else {
				if ( !st.empty() && closed.contains(String.valueOf(arr[i]))
						&& open.indexOf(st.peek()) == closed.indexOf(String.valueOf(arr[i]))) {

					st.pop();
					//System.out.println("Char Closed: " + arr[i]);
				} else {
					//System.out.println("false");
					flag = false;
					break;
				}
			}
			
		}
		if(st.isEmpty()) {
			System.out.println(flag);
		}
		else {
			flag = false;
			System.out.println(flag);
		}
		
	}

}
