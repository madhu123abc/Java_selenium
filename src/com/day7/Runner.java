package com.day7;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		Employee emp1 =new Employee("uma",899,"uma@gmail.com");
		Employee emp2 =new Employee("Rama",988,"Rama@gmail.com");
		Employee emp3 =new Employee("Rav",766,"Ravi@gmail.com");
		
		System.out.println(emp3.emaild);
		ArrayList<Employee>empList=new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		System.out.println(empList.get(0).emaild);
		System.out.println(empList.add(emp3));
		System.out.println(empList.get(1).empName);
		
        
	}

}
