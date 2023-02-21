package Assgnment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListAssignment {

	public static void main(String[] args) {
		/* Create a list of String and print the values in reverse order
		// Input – Java, Selenium, TestNG, Git, Github
		// Github, Git, TestNG, Selenium, Java
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("TestNG");
		list.add(" Git");
		list.add("Github");

		System.out.println("Before  Reversing  " + list);
		Collections.reverse(list);
		System.out.println("After Reversing  " + list);*/
             
//Write a program which will accept List of String and produce another List of string of which will have only values which starts with git
//Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
//Output- Git, Github, Gitlab, GitBash/*
      List<String>list1 =new ArrayList<>();
		list1.add("Git");
		list1.add("Github");  
		list1.add("Gitlab");
		list1.add("GitBash");
		list1.add("Selenium");
		list1.add("Java");
		list1.add("Maven");

 list1 =list1.stream().filter(g ->g.startsWith("G")).collect(Collectors.toList()); 
for(String name:list1) {
	System.out.println( "Names start with G :"+name);
}
/*Write a program that will remove duplicate values from List
Input – Java, TestNG, Maven, Java, 
Output – Java, TestNG, Maven*/
  
Set<String>s =new HashSet<>();
s.add("Java");
s.add("TestNG");
s.add("Maven");
s.add("Java");
System.out.println(s);


	
	  





		
		  
		     
		
		

		
		
		
		
		
		
		
		
		
		
		
	}	
		
		
		
		
	}


