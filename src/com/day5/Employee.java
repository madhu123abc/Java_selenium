package com.day5;

public class Employee {

	public static void main(String[] args) {
		
    Employee madhavi =new Employee();
    madhavi.dev();
    madhavi.devOpsEng();
    madhavi.automationEng();
    Employee Harika =new Employee();
    Harika.dev();
   
	}

	public void devOpsEng() {
		System.out.println("I am into Devops role");	
	}
	
	public void automationEng() {
		System.out.println("I can automate test cases");
	}
	public void dev() {
		System.out.println("I can write code");
		devOpsEng();
		automationEng();
	}
	
	
	
	
}
