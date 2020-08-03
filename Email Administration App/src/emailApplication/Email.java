package emailApplication;

import java.util.Scanner;

public class Email {
 private String firstName;
 private String lastName;
 private String password;
 private String department;
 private int mailboxCapacity;
 private String alternateEmail;
 
 //Constructor
 public Email(String firstName, String lastName) {
	 this.firstName = firstName;
	 this.lastName = lastName;
	 System.out.println("Email created.");
	 
	 //calling department
	 this.department = setDepartment();
 }

 
 //Ask for department
 private String setDepartment() {
	 System.out.println("Enter te department\n1 for Sales\n2 for Development\n3 for Accounting\n4 for None");
	 Scanner In  = new Scanner(System.in);
	 int depChoice = In.nextInt();
	 
	 if(depChoice == 1) {return "Sales";}
	 else if(depChoice == 2) {return "Dev";}
	 else if(depChoice == 3) {return "Acc";}
	 else {return "";}
 }
 //Generate random password
 
 //Set the mailbox  capacity
 
 //Change password
}
