package com.day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetExample2 {

	public static void main(String[] args) {
		List<String>list =new ArrayList<>();
		list.add("Madahavi");
		list.add("Hari");
		list.add("Ravi");
		list.add("Madhu");
		list.add("Hari");
		list.add("Madhu");
		list.add("sriram");
		//First way//
		HashSet<String>s1 =new HashSet<>(list); 
		System.out.println(s1);
		
		//Second way
		HashSet<String>s2 =new HashSet<>();
		s2.addAll(s1);
		s2.add("Bheemlesh");
		s2.add("Ramesh");
		s2.add("Raghu");
		System.out.println(s2);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
