package com.regex.test;

import com.regex.assignments.RegExMain;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
public class RegExTest {
    RegExMain obj = new RegExMain();
    @BeforeClass
    public static void welcomeText() {
        System.out.println("Welcome to User Registration Problem");

    }
    @Test
    public void validateFirstNameTest() {
        System.out.println("Valid first name of user");
        String firstName = "Shiwani";
        Assert.assertTrue(obj.validateFirstName(firstName));
    }
    @Test
    public void validateFirstNameLowerCaseShouldFail() {
        System.out.println("Invalid first name of user which contains only lowercase");
        String firstName = "shiwani";
        Assert.assertFalse(obj.validateFirstName(firstName));
    }
    @Test
    public void validateFirstNameLessThanThree() {
        System.out.println("Invalid first name of user which having only three characters");
        String firstName = "Shi";
        Assert.assertFalse(obj.validateFirstName(firstName));
    }
    @Test
    public void validateLastNameTest() {
        System.out.println("Valid last name of user");
        String firstName = "Paunikar";
        Assert.assertTrue(obj.validateLastName(firstName));
    }
    @Test
    public void validateLastNameLowerCaseShouldFail() {
        System.out.println("Invalid last name of user which contains only lowercase");
        String firstName = "paunikar";
        Assert.assertFalse(obj.validateLastName(firstName));
    }
    @Test
    public void validateLastNameLessThanThree() {
        System.out.println("Invalid last name of user which having only three characters");
        String firstName = "pan";
        Assert.assertFalse(obj.validateLastName(firstName));
    }
    @Test
    public void validateEmailTest() {
        System.out.println("Valid email id of user");
        String email = "shiwani12@gmail.com";
        Assert.assertTrue(obj.validEmail(email));
    }

    @Test
    public void validateEmailWithoutDomainShouldFail() {
        System.out.println("Invalid email id of user without domain");
        String email = "shiwani12";
        Assert.assertFalse(obj.validEmail(email));
    }

    @Test
    public void validateEmailWithStartingFirstLetterCapitalShouldFail() {
        System.out.println("Invalid email id of user having starting letter is capital");
        String email = "Shiwani12@gmail.com";
        Assert.assertFalse(obj.validEmail(email));
    }
    @Test
    public void validateMobileNoTest() {
        System.out.println("Valid mobile no of user");
        String phoneNo = "+91 8908641811";
        Assert.assertTrue(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateMobileNoWithoutCountryCodeShouldFail() {
        System.out.println("Invalid mobile no of user without country code");
        String phoneNo = "8908641811";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateMobileNoWithoutProperSimCodeShouldFail() {
        System.out.println("Invalid mobile no of user without proper sim code");
        String phoneNo = "+91 6578641811";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateInvalidMobileNoShouldFail() {
        System.out.println("Invalid mobile no of user which is more than 10 numbers");
        String phoneNo = "+91 65786418112";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }
    @Test
    public void validatePasswordTest() {
        System.out.println("Valid password of user");
        String password = "Shiwani@123";
        Assert.assertTrue(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordLimitLowerThanEightCharactersShouldFail() {
        System.out.println("Invalid password of user which contains minimum 8 characters");
        String password = "Shiwani@";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordTestLimitGreaterThanTwentyCharactersShouldFail() {
        System.out.println("Invalid password of user which contains more than 20 characters");
        String password = "Shiwani@1234567890ghfdc";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordWithoutUpperCaseShouldFail() {
        System.out.println("Invalid password of user which doesn't contains any upper case");
        String password = "shiwani@123";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordWithoutNumericNumberShouldFail() {
        System.out.println("Invalid password of user which doesn't contains any upper case");
        String password = "Shiwanis@";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordWithoutSpecialCharacterShouldFail() {
        System.out.println("Invalid password of user which doesn't contains special character");
        String password = "Shiwani123";
        Assert.assertFalse(obj.validatePassword(password));
    }
}



