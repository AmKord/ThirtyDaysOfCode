package com.thirtydayscode.practice;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStackParanthesis {
	
	public static void main(String[] args) {
		
		List<String> stack = new ArrayList<>();
		String item;
		StackOperations(stack);
		System.out.println(stack.toString());
		//String val = Pop(lst);
	}
	
	public static void Push(String item, List<String> lst) {
		
		lst.add(item);
	}

	public static String Pop(List<String> lst){

		String element = lst.get(lst.size()-1);
		lst.remove(lst.size()-1);
		return element;

	}

	public static void StackOperations(List<String> lst){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter records");
		int records = sc.nextInt();
		for (int i=0; i < records ; i++){
			lst.add(sc.next());
		}
		System.out.println("Enter option, 1 push, 2 pop");
		switch (sc.nextInt()) {
			case 1:
				System.out.println("enter element to insert");
				Push(sc.next(), lst);
				break;
		
			case 2:
				System.out.println("Popped element: "+ Pop(lst));
				break;	
			default:
				break;
		}
	}

}
