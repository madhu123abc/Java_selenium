package com.day3;

public class ConditionalStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 21;
		int marks = 81;
		int javaScore = 98;
		int code = 60;

		if (age > 20) {

			if (marks >= 80) {
				System.out.println("Eligible for interview");

				if (javaScore >= 90) {
					System.out.println("Eligible for 2nd round");
					if (code >= 90) {
						System.out.println("Eligible for third round");
					}
					else
					{
						System.out.println("Not eligible for third round");
					}
				}else {
					System.out.println("Not eligible for second round");
				}

			}

			else {

				System.out.println("sorry you are not eligible");
			}

		}

		else {
			System.out.println("Please apply after sometime-focus of study now");
		}

	}

}
