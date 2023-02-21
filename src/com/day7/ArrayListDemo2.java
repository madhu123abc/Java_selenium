package com.day7;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[]args) {
	ArrayList <String>jsAutomationTools=new ArrayList<>();
    jsAutomationTools .add("Cypress");
    jsAutomationTools .add("pwo");
    jsAutomationTools .add("WDIO");
	
	ArrayList<String>automationTools =new ArrayList<>(jsAutomationTools);
  automationTools.add("Selenium");
  automationTools.add("Java");
  automationTools.add("postman");
  System.out.println(automationTools);
	
	
	
	
	
	}
}
