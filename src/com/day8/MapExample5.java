package com.day8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample5 {

	public static void main(String[] args) {
	Map<Integer ,String>m1 =new LinkedHashMap<>();
     m1.put(null, "Avi");
     m1.put(7, "Rama");
     m1.put(1, "Rohan");
     m1.put(78, null);
	System.out.println(m1);//it allows null values
	
	Map<Integer ,String>m2 =new TreeMap<>();
    m2.put(null, "Avi");
    m2.put(7, "Rama");
    m2.put(1, "Rohan");
    m2.put(78, null);
	System.out.println(m2);//it allows null
	//null values are not allowed in Map
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
