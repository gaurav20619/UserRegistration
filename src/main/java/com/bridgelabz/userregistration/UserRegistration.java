package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		UserInputValidation userInputValidation = new UserInputValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println(userInputValidation.isValidFirstName(firstName) ? "Valid" : "In Valid");
        String lastName = scanner.next();
        System.out.println(userInputValidation.isValidLastName(lastName) ? "Valid" : "In Valid");
        String email = scanner.next();
        System.out.println(userInputValidation.isValidEmail(email) ? "Valid" : "In Valid");
        scanner.close();
	}
}
