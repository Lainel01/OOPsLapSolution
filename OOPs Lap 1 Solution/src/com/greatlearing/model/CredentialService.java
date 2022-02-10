package com.greatlearing.model;

import java.util.Random;

public class CredentialService {
	
	public static void main(String args[]) {
		System.out.println(generatePassword());
	}
	
	public static char[] generatePassword() {

		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "@!#$%&";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[10];
		String values = capitalCaseLetters + lowerCaseLetters + numbers + specialCharacters;
		
		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 0; i < 10; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear "+employee.getFirstName()+ " your generated credentials are as follows ");
		System.out.println("Email - "+ email);
		System.out.print("Password - " + "");
		System.out.print(generatedPassword);
	}

}
