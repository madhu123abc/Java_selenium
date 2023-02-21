package com.day6;

public class Student {

	public static void main(String[] args) {
	Student s1 =new Student();
	s1.sum(5);
    s1.sum(4, 8);
    s1.sum(90, 80, 70);
    
	}
	public void sum(int x) {
		System.out.println(x);
	}
	public void sum(int x,int y) {
		int result =x+y;
		System.out.println(result);
	}
   public void sum(int x,int y,int z) {
	   int result =x+y+z;
	   System.out.println(result);
   }
}
 