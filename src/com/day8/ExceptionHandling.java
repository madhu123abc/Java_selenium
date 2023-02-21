package com.day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the First Number 1");
			int n1 =sc.nextInt();
			System.out.println("Enter Second Number2");
			int n2 =sc.nextInt();
         int result =n1/n2;
         System.out.println("Result      "+result);
		}
		catch(ArithmeticException e){
		System.out.println("Hey buddy don't give zero-use positive numbers "+e.getMessage());	
		}
		catch(InputMismatchException e) {
			System.out.println("Hey Buddy its is a calc plese provide numbers not String"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Something went wrong-we are working on it" +e.getMessage());
		}
		catch(Throwable e) {
			System.out.println("Something went wrong-we are working on it" +e.getMessage());

		}
		finally {
			System.out.println("Closing the connection.....");
			sc.close();
			System.out.println("Connection closed");
			System.out.println("Bye");
		}
		
		sc.close();
		System.out.println("Bye");
	}

}
