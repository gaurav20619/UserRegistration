package com.bridgelabz.userregistration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserRegistration {
    public static void main(String[] args) throws IOException {

        UserInputValidation userInputValidationUtil = new UserInputValidation();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("******* FIRSTNAME VALIDATION *******");
            System.out.println("Please Enter first name: ");
            String firstName = bufferedReader.readLine();
            System.out.println(UserInputValidation.validateFirstName().validate(firstName) ? "Valid" : "InValid");
            System.out.println("******* LASTNAME VALIDATION *******");
            System.out.println("Please Enter last name: ");
            String lastName = bufferedReader.readLine();
            System.out.println(UserInputValidation.validateLastName().validate(lastName) ? "Valid" : "InValid");
            System.out.println("******* EMAIL VALIDATION *******");
            System.out.println("Please Enter email: ");
            String email = bufferedReader.readLine();
            System.out.println(UserInputValidation.validateEmail().validate(email) ? "Valid" : "InValid");
            System.out.println("******* MOBILE FORMAT VALIDATION *******");
            System.out.println("Please Enter Mobile Number: ");
            String mobileNumber = bufferedReader.readLine();
            System.out.println(UserInputValidation.validateMobileNumber().validate(mobileNumber) ? "Valid" : "InValid");
            System.out.println("******* PASSWORD VALIDATION *******");
            System.out.println("Please Enter Password: ");
            String password = bufferedReader.readLine();
            System.out.println(UserInputValidation.validatePassword().validate(password) ? "Valid" : "InValid");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try{
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}
}
