package com.Assignments;

public class Assignment8 {

	public static void main(String[] args) {
		int marks[] =new int[5];
		marks[0]=78;
		marks [1]=12;
		marks[2]=89;
		marks[3]=55;
		marks[4]=35;
		System.out.println(marks.length);
		
		for(int index=0;index<=4;index++) {
		   if(marks[index]>70) {
			   System.out.println("marks are above 70");
			}
		   else
		   {
			   System.out.println("marks are below 70");
		   }
		}		
		
	}	
		
}		
			
		
			

