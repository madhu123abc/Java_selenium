package com.day6;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1 =sc.nextInt();
		System.out.println("Enter Second Number ");
		int n2 =sc.nextInt();
		System.out.println("Enter Thrd Number");
		int n3 =sc.nextInt();
	
		int result =n1+n2+n3;
		System.out.println("Result is "+result);
		sc.close();
		

	}

}
