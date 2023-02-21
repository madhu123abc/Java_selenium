package com.day7;

public class DepositCalci  extends  LoanCalci implements Calci{


	public static void main(String[] args) {
		 Calci obj1  =new DepositCalci();
		 obj1.add();
		 obj1.div();
		 obj1.mul();
		 obj1.sub();
		 
		 
		 LoanCalci obj2 = new DepositCalci();
		 obj2.sub();
		 obj2.add();
		 obj2.div();
		 obj2.mul();
		 obj2.sum();
		 
		 DepositCalci obj3 =new DepositCalci();
		 obj3.add();
		 obj3.div();
		 obj3.mul();
		 obj3.sub();
		 obj3.sum();
		 
		 
		 
		 
		 

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("I can add");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("I can subtract");
	
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("I can multiplication");
	
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("I can divide");
	
	}

	

}
