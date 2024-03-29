package emailApplication;

import java.util.Scanner;

public class Email {
 private String firstName;
 private String lastName;
 private String password;
 private String department;
 private String email;
 private int mailboxCapacity;
 private int randomPwl = 8;
 private String alternateEmail;
 private String emailSuffix = ".com";
 
 //Constructor
 public Email(String firstName, String lastName) {
	 this.firstName = firstName;
	 this.lastName = lastName;
	 System.out.println("Email created.");
	 
	 //calling department
	 this.department = setDepartment();
	 System.out.println("Department : " + this.department);
	 
	 //random PW
	 this.password = randomPassword(randomPwl);
	 System.out.println("Your password is : " + this.password);
	 
	 //combine details to generate emails
	 email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + emailSuffix;
	 System.out.println(email);
 }

 
 //Ask for department
 private String setDepartment() {
	 System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n4 for None");
	 Scanner In  = new Scanner(System.in);
	 int depChoice = In.nextInt();
	 
	 if(depChoice == 1) {return "Sales";}
	 else if(depChoice == 2) {return "Dev";}
	 else if(depChoice == 3) {return "Acc";}
	 else {return "";}
 }
 //Generate random password
 private String randomPassword(int length) {
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*123456789";
	char[] password = new char[length];
	for(int i = 0; i < length; i++) {
		int rand = (int)(Math.random() * password.length);
		password[i] = passwordSet.charAt(rand);  			
	}
	return new String(password);
 } 
 
 //Set the mailbox  capacity
 
 //Change password
}
