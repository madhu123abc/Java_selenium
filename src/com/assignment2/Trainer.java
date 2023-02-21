package com.assignment2;

public class Trainer {
	String TrainerName;
	String TrainerDepartment;
	String TrainerEmail;
	int TrainerId;

	public Trainer(String name, String department, String email, int id) {
		
		TrainerName = name;
		TrainerDepartment = department;
		TrainerEmail = email;
		TrainerId = id;
	}

	public static void main(String[] args) {
		Trainer t1 =new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
		Trainer t2 =new Trainer("Hitesh","Dev","mukesh@gmail.com",2);
		Trainer t3 =new Trainer("Mukesh","DevOps","mukesh@gmail.com",3);
		t1.Selenium();
		t2.WebDevelopment();
		t3.DevOps();

	}
	public void Selenium() {
		System.out.println("Trainer1 can teach Selenium");
	}
	public void DevOps() {
		System.out.println("Trainer3 can teach DevOps");
	}
	public void WebDevelopment() {
		System.out.println("Trainer2 can teach WebDevelopment");
	}
      
}
