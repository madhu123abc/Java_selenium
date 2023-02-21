package com.day5;

public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci obj = new Calci();
	int s1=obj.sum(12, 35);
	int	s2=obj.sub(98, 47);
	int s3=obj.multi(89, 78);
    int s4=  obj.div(37, 10);
    String s5= obj.getName("Madhavi", "Duddu");
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    
    
    
    
    
    
	}

	public int sum(int a, int b)

	{
		int result = a + b;
		return result;
		
	}

	public int sub(int a, int b) {
		int result = a - b;
		return result;
	}

	public int multi(int a, int b) {
		int result = a * b;
		return result;

	}
	public int div (int a, int b) {
		int result =a/b;
		return result;
	}
	public String getName(String fName,String lName) {
		
		String result =fName +" "+ lName;
		return result;
	}


}
