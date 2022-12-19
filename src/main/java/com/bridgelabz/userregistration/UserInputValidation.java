package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidation {
    // Creating isValidFirstName method which will return boolean 
    // to validate the first name given by user using regex
	
	public boolean isValidFirstName(String firstName) {
	    // regex pattern to check the firstName
        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";  
	    Pattern pattern = Pattern.compile(firstNameRegex);
	    Matcher matcher = pattern.matcher(firstName);
	    return matcher.matches();
    }
        // Creating isValidLastName method to validate the last name given by user using regex
	    public boolean isValidLastName(String lastName) {
	        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";

	        Pattern pattern = Pattern.compile(firstNameRegex);

	        Matcher matcher = pattern.matcher(lastName);

	        return matcher.matches();

	}
     // Creating isValidEmail method  to validate the email given by user using regex

     public boolean isValidEmail(String email) {

        String emailRegex = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@" +
                "([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}" +
                "(?:(\\.([A-Za-z]{2})))?$";;

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
    //Creating isValidMobileNumber method to validate the mobile format given by user using regex
    public boolean isValidMobileNumber(String mobileNumber) {
        String mobileNumberRegex = "^[1-9]{2}[\\s][0-9]{10}$";
        Pattern pattern = Pattern.compile(mobileNumberRegex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }
    //Creating isValidPassword method to validate the password given by user using regex
    public boolean isValidPassword(String password) {
        System.out.println(password);
        String passwordRegex = "^(?=.*[A-Z]{1}).{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
