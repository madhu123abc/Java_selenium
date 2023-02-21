package com.assignment3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionAssignments {
	// Write a program which will pick the values from Array and Store them List.
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(90, 78, 68, 56, 89);

		System.out.println(list);

		/*
		 * Create a list of numbers 33,44,55,66,77,88 and perform below operation Remove
		 * second element from list using index Remove second element from list using
		 * value Add 90 at index 3 Get the length of list Print all values from list
		 * using any values Convert List into array.
		 */

		List<Integer> list1 = new ArrayList<>();
		list1.add(33);
		list1.add(44);
		list1.add(55);
		list1.add(66);
		list1.add(77);
		list1.add(88);
		System.out.println(list1);
		
		 //Remove second element from list using index Remove second element
		System.out.println(list1.remove(2));
		//Add 90 at index 3
		list1.add(3, 90);
		System.out.println(list1);
		//Get the length of list Print all values from list
		System.out.println("Length of list is......" + list1.size());
		//Print all values from list using any values

		System.out.println(list1);
		//Convert List into array.
		Integer[]array =  new Integer[list1.size()];
			for(int i=0; i<list1.size();i++) {
				array[i]=list1.get(i);
			
		  // System.out.println(array[i]);
		   
			}
//Write a program which will display true if list contains Mobile else prints false
//	List  - Web Automation, API Automation, Mobile Automation.
//	Output – True 
    
      List<String>list2 =new ArrayList<>();
      list2.add("Web Automation");
      list2.add("API Automation");
      list2.add("Mobile Automation");
      System.out.println(list2.contains("Mobile Automation"));
			
		
		
			
			
		
	}
}
