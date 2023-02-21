package com.Assignments;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,34,66,85,900};
		int key =85;
		boolean flag =false;
		
		for(int i=0;i<=a.length-1;i++) {
			if(key==a[i]) {
			System.out.println("Element found at :"  +i);
	        flag= true;
	         break;
	       
			}
		}
		if(flag==false) {
		System.out.println("Element not found");
		}
	}
	
}	
		
		
			
		
		
		
		
		

	






/*Task 9- Write a program which will break the current execution if it find number 85
Input – [12,34,66,85,900]*/
