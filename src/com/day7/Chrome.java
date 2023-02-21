package com.day7;

public class Chrome implements WebDriver {

	public static void main(String[] args) {
	Chrome obj =new Chrome();
    obj.savePassword();         //We can access all methods from Base class and  child class//
    obj.closeBrowser();
    obj.startApplication();
    obj.startApplication();
    System.out.println("*****************");
    
    WebDriver obj1 =new Chrome();
    obj1.startBrowser();
    obj1.closeBrowser();
    obj1.startApplication();//we can access only webDriver Method//
    System.out.println(obj1.name);//it's showing warning because we can access variable in a static way//
    System.out.println(WebDriver.name);
    
	// WebDriver obj2 =new WebDriver();//We cannot create an object of WebDriver//
     
    
    }

	public void savePassword() {

		System.out.println("Chrome can save password");

	}

	@Override
	public void startBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Start Chrome Browser");
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Close  Chrome Browser");
	}

	@Override
	public void startApplication() {
		// TODO Auto-generated method stub
		System.out.println("Start Application");
	}
	
	


}
