package com.day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetExample3 {

	public static void main(String[] args) {
	HashSet<String>s1 =new HashSet<>();
	s1.add("Madhu");
	s1.add("Ravi");
	s1.add("Raju");//
	s1.add("Kavi");//
	s1.add("Manasa");//
	 //I want to access all set values in index manners,is this possble when how?
	
	List<String>l1 =new ArrayList<>(s1);
      System.out.println(l1);
      System.out.println(l1.get(1));
	
	
	
	
	
	
	
	
	
	}

}
