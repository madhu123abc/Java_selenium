package com.day5;

public class Emp {
	
	String name;
	int empId;
	String email;
     public Emp(String employeeName,int employeeId,String emailId) {
    	 name =employeeName;
    	 empId=employeeId;
    	 email =emailId;
    	 
    	 System.out.println("Constructor has being called");
    			 
     }
	
    public static void main(String[] args) {
		 Emp emp1 =new Emp("Rajesh",11,"Rajesh@gmail.com");
         Emp emp2 =new Emp("Madhavi",19,"Madhu@123gmail.com");
         Emp emp3 =new Emp("Shyam",31,"Shyam@123yahoo.com");
         //emp2.displayInformation();
         emp3.logIn();
         System.out.println(emp1.email);
         System.out.println(emp2.name);
         System.out.println(emp3.empId);
	}
	public void displayInformation() {
		 System.out.println(" Name is "+name);
		 System.out.println(" EmpID is "+empId);
		 System.out.println("EmailId is" +email);
	}
	
	public void logIn() {
		 System.out.println("Employee has logged in");
	}
	
	public void logOut() {
		System.out.println("Employee has logged out");
		
	}
	
	
	
	
	
	

}
