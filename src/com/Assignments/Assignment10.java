package com.Assignments;

public class Assignment10 {

	public static void main(String[] args) {
		String a[] = {"Java","Javascript","Selenium","Python","Mukesh"};
		String key = "Selenium";
		boolean value = false;

		for (int i=0;i<a.length;i++) {
			if(key==a[i]) {
				System.out.println("Element  found  at :  "  +i );
				value =true;
				break;
				}
		}
	
	
			if(value==false) {
				System.out.println("Element not found");
			}
				
			
	       	
	}	
			
	}



/*
 * Write a program which will break the current execution if it find “Selenium”
 * Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]
 */
