package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import exceptions.InvalidEmailException;
import exceptions.InvalidFirstNameException;
import exceptions.InvalidLastNameException;
import exceptions.InvalidMobileNumberException;
import exceptions.InvalidPasswordException;

public class UserInputValidationTest {
	@Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
        result = userInputValidation.isValidFirstName("gaurav");
        Assert.assertEquals(true, result);
        } catch (InvalidFirstNameException e) {
        }
    }
	 @Test
	    public void givenFirstName_WhenShort_ShouldThrowException() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	        result = userInputValidation.isValidFirstName("sh");
	        } catch (InvalidFirstNameException e) {
	        	Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	 }
	 @Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
		 UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidLastName("singh");
	        } catch (InvalidLastNameException e) {
	            Assert.assertEquals(true, result);
	        }
	    }

	    @Test
	    public void givenLastName_WhenShort_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidLastName("ga");
	        } catch (InvalidLastNameException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenLastName_WithSplChar_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidLastName("S@ngh");
	        } catch (InvalidLastNameException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenLastName_WithNumber_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidLastName("gh67nk9");
	        } catch (InvalidLastNameException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenEmail_WhenValid_ShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidEmail("gaurav.69@gmail.com");
	        } catch (InvalidEmailException e) {
	            Assert.assertEquals(true, result);
	        }
	    }

	    @Test
	    public void givenEmail_WhenNotValid_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidEmail("gaurav.619.gmail.com");
	        } catch (InvalidEmailException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidMobileNumber("9905459254");
	        } catch (InvalidMobileNumberException e) {
	            Assert.assertEquals(true, result);
	        }
	    }

	    @Test
	    public void givenMobileNum_WhenNotProper_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidMobileNumber("908765-4321908");
	        } catch (InvalidMobileNumberException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenPassword_WhenValid_ShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidPassword("P@ssw0rd");
	        } catch (InvalidPasswordException e) {
	            Assert.assertEquals(true, result);
	        }
	    }

	    @Test
	    public void givenPassword_WithoutCapitalLetter_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidPassword("hgsuyds5ndj@");
	        } catch (InvalidPasswordException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenPassword_WithoutNumericValue_ShouldReturnFalse() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidPassword("bsdj@HhcsBB");
	        } catch (InvalidPasswordException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenPassword_WithoutSplChar_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidPassword("Pvhs5665vhj");
	        } catch (InvalidPasswordException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
}
}
