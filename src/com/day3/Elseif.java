package com.day3;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 70;

		if (marks>= 90) {
			System.out.println("A++Grade");

		}
		else if(marks<80 &&marks>=70)
		{
			System.out.println("B Grade");
		}
		else if(marks<70 && marks>=50)
		{
			System.out.println("C grade");
			
		}
		else if(marks<35)
		{
			System.out.println("Fail");
		}
			
	}

}
