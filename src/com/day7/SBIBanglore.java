package com.day7;

public class SBIBanglore implements SBI{
   public static void main (String[] args) {
	   RBI obj1 =new SBIBanglore ();
	   obj1.deposit();
	   obj1.withdraw();
	   SBI obj2 =new SBIBanglore();
	   obj2.loan();
	   obj2.withdraw();
	   obj2.deposit();
	   
	   SBIBanglore obj3 =new SBIBanglore();
	   obj3.deposit();
	   obj3.loan();
	   obj3.withdraw();
	   obj3.goldLoan();
	   
	   
	   
	   
	   
	   
   }
	
	
	
	
	
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
	}

	public  void goldLoan() {
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
