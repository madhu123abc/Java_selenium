package com.day7;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		ArrayList list1 =new ArrayList();
		list1.add(12);
		list1.add(25.00d);
		list1.add('t');
		list1.add("Madhavi");
		list1.add(6778889999l);
		list1.add(89.8888888);
		System.out.println(list1);
		System.out.println(list1.get(3));
		System.out.println("End");
		
		
		ArrayList list2 =new ArrayList();
		list2.add("Selenium");
		list2.add("Java");
		list2.add("PostMan");
		list2.addAll(list1);
		System.out.println(list2);
		list1.remove(3);
		System.out.println(list1);
		
		
		

	}

}
