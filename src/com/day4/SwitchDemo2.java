package com.day4;

public class SwitchDemo2 {

	public static void main(String[] args) {
		String browser ="Mozilla Firefox";
	    switch(browser)
	    {
	    case "Chrome":
	     System.out.println("Start Chrome session");
	     break;
	    case "Firefox":
	     System.out.println("Start Ff session");
	     break;
	    case "Edge Browser":
	    	System.out.println("Start Edge Browser session");
	     break;
	     default : 
	     System.out.println("Please use Chrome ,Ff or safari");
	     break;
	     
	    }
	}

}
