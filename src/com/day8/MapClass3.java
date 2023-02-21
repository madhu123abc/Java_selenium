package com.day8;

import java.util.HashMap;
import java.util.Map;

public class MapClass3 {

	public static void main(String[] args) {
		Map<String,Object>m1 =new HashMap<>();
		m1.put("id", 1);
		m1.put("name","Uma");
		m1.put("status", false);
		m1.put("marks", 50.8);
		
		Map<String,Object>m2 =new HashMap<>();
		m2.put("id", 89);
		m2.put("name", "Harshika");
		m2.put("status", true);
		m2.put("marks", 80.3);
		System.out.println(m1);
		
		//Create one map which can  accept key as Integer and value as map
Map<Integer,Map<String,Object>>allDetails =new HashMap<>();
allDetails.put(1,m1);
allDetails.put(2, m2);		
	System.out.println(allDetails.get(2).get("status"));
	
		
		
		
		
		
		
	}

}
