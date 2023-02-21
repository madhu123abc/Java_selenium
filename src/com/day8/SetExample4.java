package com.day8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample4 {

	public static void main(String[] args) {
		Set<String>s1 =new HashSet<>();
		s1.add("ABC");
		s1.add("abc");
		s1.add("xyz");
		
		System.out.println(s1);
		
		Set<Integer>s2 =new TreeSet<>();
		s2.add(2000);
		s2.add(700);
		s2.add(400);
		s2.add(500);
		//s2.add(null);
		//s2.add(null);
		//TreeSet doesn't allow null values
		System.out.println(s2);
		
		Set<String>s3 =new TreeSet<>();
         s3.add("zoya");
         s3.add("Akhtar");
         s3.add("salman");
         s3.add("sujata");
         System.out.println(s3);
	}

}
