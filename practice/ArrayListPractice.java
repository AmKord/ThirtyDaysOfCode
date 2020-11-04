package com.thirtydayscode.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lst = new ArrayList<>();
		
		EnterElements(lst, sc);		
		DoOperations(lst, sc);
		PrintList(lst);
		System.out.println(lst.toString());
		
		
		
	}
	
	public static void PrintList(List<Integer> lst) {
		
		for(int i : lst) {
			System.out.print(i+" ");
		}
	}
	
	public static void EnterElements(List<Integer> lst, Scanner sc) {
		
		int elements = sc.nextInt();
		int i=0;
		while(i!=elements) {
			lst.add(sc.nextInt());
			i++;
		}
		
		
	}
	
	public static void DoOperations(List<Integer> lst, Scanner sc) {
		
		int queries = sc.nextInt();
		int count = 0;
		while (count < queries) {
			String option = sc.next();
			switch (option) {
			case "Insert":
					lst.add(sc.nextInt(), sc.nextInt());
					
				break;
				
			case "Delete":
				lst.remove(sc.nextInt());
				
			break;
							

			default:
				break;
			}
			count ++;
		}
		
	}
	
	

}
