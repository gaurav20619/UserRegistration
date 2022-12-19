package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserInputValidationTest {
	@Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Gaurav");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Gs");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidLastName("Singh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidLastName("Sh");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("gauravsinghraijada619@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("gaurav.619.gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidMobileNumber("91 9905459253");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenMobileNum_WhenNotProper_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidMobileNumber("90-9905459253");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
    	UserInputValidation userInputValidation = new UserInputValidation();
        boolean result =userInputValidation.isValidPassword("P@ssw0rd");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WithoutCapitalLetter_ShouldReturnFalse() {
    	UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPassword("hgsuyds5ndj@");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WithoutNumericValue_ShouldReturnFalse() {
    	UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPassword("bsdj@HhcsBB");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WithoutSplChar_ShouldReturnFalse() {
    	UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidPassword("Pvhs5665vhj");
        Assert.assertFalse( result);
    }
}
