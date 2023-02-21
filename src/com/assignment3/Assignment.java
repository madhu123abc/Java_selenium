package com.assignment3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Assignment {

	public static void main(String[] args) {
		// Write a program which can store List of Integer values and print all the
		// values using for loop.

		List<Integer> list = new ArrayList<>();
		list.add(566);
		list.add(788);
		list.add(678);
		list.add(978);
		list.add(5433);
		for (int i = 0; i < list.size(); i++) {

		}
		System.out.println(list);

		// Write a program which can store List of Integer values and print all the
		// values using for iterator

		List<Integer> score = Arrays.asList(89, 56, 78, 57, 89, 99);
		Iterator<Integer> itr = score.iterator();
		while (itr.hasNext()) {
			Integer marks = itr.next();
			System.out.println(marks);
		}
// Write a program which will print sum of all numbers which is stored in list.
		List<Integer> list1 = new ArrayList<>();
		list1.add(400);
		list1.add(300);
		list1.add(900);
		int sum =0;
		for(int i=0;i<list1.size();i++) {
		 sum =sum+list1.get(i);
		}
		System.out.println(sum);
		
		
		
	}

}
