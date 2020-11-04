package com.thirtydayscode.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapPractice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		
		PopulatePhonebook(map, sc);
		List<String> lst = GetQueries(map, sc);
		PrintMap(map, lst);
		
	}
	
	public static void PopulatePhonebook(Map<String, Integer> map , Scanner sc) {
		
		int totalElements = sc.nextInt();
		int count = 0;
		while(count < totalElements) {
			sc.nextLine();
			map.put( AddName(sc.nextLine()), AddPhoneNumber(sc.nextInt()));
			count++;
		}
		
		System.out.println(map.toString());
		
	}
	
	public static String AddName(String name) {
		
//		while(sc.hasNext()) {
//			name = name + sc.next();
//		}
		return name;
	}
	public static Integer AddPhoneNumber(Integer phone) {
		
		
		return phone;
	}
	
	public static String ValidateFormatName(String name) {
		
		name.toLowerCase();
		return name;
	}
	
	public static List<String> GetQueries(Map<String, Integer> map,Scanner sc) {
		List<String> lst = new ArrayList<>();
		while(sc.hasNext()) {
			lst.add(sc.next());
		}
		return lst;
	}
	
	public static void PrintMap(Map<String, Integer> map, List<String> lst) {
		
		for(String query: lst) {
			if(map.containsKey(query)) {
				System.out.println(query+"="+map.get(query));
			}
			else {
				System.out.println("Not Found");
			}
		}
		
		for(String i : map.keySet()) {
			System.out.println(i + " "+ map.get(i));
		}
		
	}

}
