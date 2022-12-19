package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.InvalidEmailException;
import exceptions.InvalidFirstNameException;
import exceptions.InvalidLastNameException;
import exceptions.InvalidMobileNumberException;
import exceptions.InvalidPasswordException;

public class UserInputValidation  {
    @FunctionalInterface
    public interface Validate {
        // Declaring an Abstract method
        boolean validate(String input);
    }

    //method validateFirstName to validate first name using regex using lambda function
    //method return - Validate type

    public static Validate validateFirstName() {
        return firstName -> firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }

    // method validateLastName to validate last name using regex using lambda function
    // Validate type
    public static Validate validateLastName() {
        return lastName -> lastName.matches("^[A-Z]{1}[a-z]{2,}$");
    }

    //Method validateEmail to validate email using regex using lambda function
    //return - Validate type
    public static Validate validateEmail() {
        return email -> email.matches("^[a-zA-Z-9]+([._+-]?[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2})?$");
    }

    //method validateMobileNumber to validate mobile number using regex using lambda function
    //return - Validate type
    public static Validate validateMobileNumber() {
        return mobileNumber -> mobileNumber.matches("^[0-9]{2}[\\s][0-9]{10}$");
    }


    // method validatePassword to validate password using regex using lambda function
    //return - Validate type

    public static Validate validatePassword() {
        return password -> password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*" +
                "[\\@\\#\\^\\!\\$\\%\\&\\?][a-zA-Z0-9]*$");
    }
}
