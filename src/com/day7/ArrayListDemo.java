package com.day7;

import java.util.ArrayList;

public class ArrayListDemo {
/*
 * Collection will take wrapper class
 * 
 * 
 * 
 * 
 * 
 */
 
	public static void main(String[] args) {
		ArrayList<String>automationTools =new ArrayList<>();
		automationTools.add("Jenkins");
		automationTools.add("java");
		automationTools.add("Java");
		automationTools.add("postman");
		System.out.println(automationTools);
		
		
		ArrayList<Integer>marks=new ArrayList<>();
		marks.add(89);
		marks.add(78);
		marks.add(888888);
		System.out.println(marks.get(2));
		

	}

}
