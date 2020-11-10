package com.thirtydayscode.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NestedList {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> parentList = new ArrayList<>();
		AddRecordsToParentList(parentList, sc);
		//PrintList(parentList);
		QueryList(parentList, sc);
	}
	
	public static List<Integer> AddRecordsToNestedList(List<Integer> nestedList, Scanner sc) {
		int nestedListSize = sc.nextInt();
		
		for(int i=0; i<nestedListSize; i++) {
			nestedList.add(sc.nextInt());
		}
		
		return nestedList;
	}
	
	public static void AddRecordsToParentList(List<List<Integer>> parentList, Scanner sc) {
		
		int parentListSize = sc.nextInt();
		
		for(int i=0; i<parentListSize; i++) {
			List<Integer> nestedList = new ArrayList<>();
			parentList.add(AddRecordsToNestedList(nestedList, sc));
		}
		
	}
	
	public static void QueryList(List<List<Integer>> parentlist , Scanner sc) {
		System.out.println("QUERY");
		int input = sc.nextInt();
		List<String> result = new ArrayList<>();
		for(int i=0; i<input; i++) {
			int listNumber = sc.nextInt()-1;
			int recordNumber = sc.nextInt()-1;
			if(listNumber <= parentlist.size()) {
				List<Integer>tempLst  = parentlist.get(listNumber);
				if(recordNumber < tempLst.size()) {
					result.add(tempLst.get(recordNumber).toString());
				}
				else {
					result.add("ERROR!");
				}
			}
			else {
				result.add("ERROR!");
			}
			
			
		}
		for(String i : result) {
			System.out.println(i);
		}
		
	}
	
	public static void PrintList(List<List<Integer>> lst) {
		System.out.println("PRINTING");
		for(List<Integer> i  : lst) {
			System.out.println();
			for(int j : i) {
				System.out.print(" " +j);
			}
		}
		
	}

}
