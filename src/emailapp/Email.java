package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 8;
	private String companySuffix = "company.com";
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("Email: " + this.firstName + " " + this.lastName);
		
		this.department = setDepatment();
		// System.out.println("Depatment: " + this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		// System.out.println("Your Email is: " + email);
	}
	
	private String setDepatment() {
		System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner scanner = new Scanner(System.in);
		int depChoice = scanner.nextInt();
		
		if (depChoice == 1) { return "sales"; }
		else if (depChoice == 2) { return "dev"; }
		else if (depChoice == 3) { return "acct"; }
		else { return ""; }
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJLKMNOPQRSTUVWXYZ0123456789!@#$%&";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	public void setMailBoxCapacity(int mailBoxCapacity) { this.mailBoxCapacity = mailBoxCapacity; }

	public void setAlternateEmail(String alternateEmail) { this.alternateEmail = alternateEmail; }
	
	public void changePassword(String password) { this.password = password; }

	public int getMailBoxCapacity() { return mailBoxCapacity; }

	public String getAlternateEmail() { return alternateEmail; }
	
	public String getPassword() { return password; }
	
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nCompany email: " + email + 
				"\nMailbox Capacity: " + mailBoxCapacity + "mb";
	}
	
}
