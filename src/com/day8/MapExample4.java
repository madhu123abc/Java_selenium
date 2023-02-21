package com.day8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample4 {

	public static void main(String[] args) {
		Map<Integer,String>m1 =new LinkedHashMap<>();
		
		m1.put(5, "Bhimesh");
		m1.put(1,"Syamala");
		m1.put(2, "Harish");
		System.out.println("Map using LinkedHashMap" + m1);
		//it will be available in same order
Map<Integer,String>m2 =new HashMap<>();
		
		m2.put(6, "Bhimesh");
		m2.put(4,"Syamala");
		m2.put(2, "Harish");
		System.out.println(m2);  //It  the order
		
Map<Integer,String>m3 =new TreeMap<>();
		
		m3.put(9, "Bhimesh");
		m3.put(1,"Syamala");
		m3.put(2, "Harish");
		System.out.println("Map using TreeMap" +m3);  //It preserves the order
		
		
		
		
		
		
		
		
		
		
}
}