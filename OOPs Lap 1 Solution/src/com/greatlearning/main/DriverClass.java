package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearing.model.CredentialService;

import com.greatlearing.model.Employee;

public class DriverClass {
	
	public static void main(String args[]) {
	
		System.out.println("Please enter your Department ");
		System.out.println("1) Technical");
		System.out.println("2) Admin");
		System.out.println("3) Human Resource");
		System.out.println("4) Legal");
		
		Employee employee = new Employee();
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword = CredentialService.generatePassword();
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
	
		if (option == 1) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		else if (option == 2) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "admin");
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		
		else if (option == 3) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr");
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
	
		else if (option == 4) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal");
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		
		else
			System.out.println("Please Enter a Valid Option");
		
		sc.close();
		
	}

}

