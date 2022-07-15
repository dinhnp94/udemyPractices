package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPassLength = 8;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	//Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.print("Email Created: " + this.firstName + " " + this.lastName + "\n");
		
		//Asking for department
		this.department = setDepartment();
		//System.out.print("Department: " + this.department + "\n");
		
		//Generate email
		if (this.department == "") {
			this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.companySuffix;
		} else {
			this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + this.companySuffix;
		}
		
		//System.out.print("Your Email: " + this.email +"\n");
		
		//Generate random password
		this.password = randPassword(this.defaultPassLength);
		//System.out.print("Your Password: " + this.password + "\n");
		
		
	}
	//Ask for the department
	private String setDepartment() {
		System.out.print("Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depInput = in.nextInt();
		if (depInput == 1) { return "sales"; }
		else if (depInput == 2) { return "dev"; }
		else if (depInput == 3)	{ return "acct"; }
		else if (depInput == 0) { 
			System.out.print("Deparment: none");
			return ""; 
			}
		else { return setDepartment(); }
	}	
	
	//Generate a random password
	private String randPassword(int length) {
		String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%^&*";
		char[] randomPass = new char[length];
		for (int i = 0 ; i < length; i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			randomPass[i] = passwordSet.charAt(rand);
		}
		return new String(randomPass);
	}
	
	
	//Set the alternate email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	//Change email capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	//Getter
	public String getEmail() { return this.email; };
	public String getAlternateEmail() { return this.alternateEmail; };
	public String getPassword() { return this.password; };
	public int getMailboxCapacity() { return this.mailboxCapacity; };
	
	//Show info
	public void showInfo() {
		System.out.print("Name: " + this.firstName + " " + this.lastName + "\n" +
						"Email: " + this.email + "\n" +
						"Mailbox Capacity: " + this.mailboxCapacity + "\n");
	}
	
}
