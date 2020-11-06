package com.thirtydayscode.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStack {
	
	public static void main(String[] args) {
		
		List<String> stack = new ArrayList<>();
		
		StackOperations(stack);
		System.out.println(stack.toString());
		
	}
	
	public void Push(String item, List<String> lst) {
		
		lst.add(item);
	}

	public String Pop(List<String> lst){

		String element = lst.get(lst.size()-1);
		lst.remove(lst.size()-1);
		return element;

	}

	public static void StackOperations(List<String> lst){
		JavaStack js = new JavaStack();
		
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
				js.Push(sc.next(), lst);
				break;
		
			case 2:
				System.out.println("Popped element: "+ js.Pop(lst));
				break;	
			default:
				break;
		}
		sc.close();
	}

}
