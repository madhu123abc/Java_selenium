package com.day8;

import java.util.HashMap;

public class MapExample {
	public static void main (String[] args){
	HashMap<Integer,String> m1=new HashMap<>();
	m1.put(1,"Dapo");
	m1.put(2, "Rohan");
	m1.put(3, "Syamala");
	m1.put(5, "santhosh");
	
	System.out.println(m1);
	System.out.println(m1.get(67));
	System.out.println(m1.get(89));
	System.out.println(m1.containsKey(5));
	System.out.println(m1.size());
	System.out.println(m1.remove(5));
	System.out.println(m1.size());
	
	
	}
}
