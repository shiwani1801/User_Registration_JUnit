package com.regex.test;

import com.regex.assignments.RegExMain;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
public class RegExTest {
    @BeforeClass
    public static void welcomeText() {
        System.out.println("Welcome to User Registration Problem");
    }
    @Test
    public void validateFirstNameTest() {
        RegExMain obj = new RegExMain();
        System.out.println("Valid first name of user");
        String firstName = "Shiwani";
        Assert.assertTrue(obj.validateFirstName(firstName));
    }
    @Test
    public void validateFirstNameLowerCaseShouldFail() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid first name of user which contains only lowercase");
        String firstName = "shiwani";
        Assert.assertFalse(obj.validateFirstName(firstName));
    }
    @Test
    public void validateFirstNameLessThanThree() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid first name of user which having only three characters");
        String firstName = "Shi";
        Assert.assertFalse(obj.validateFirstName(firstName));
    }
    @Test
    public void validateLastNameTest() {
        RegExMain obj = new RegExMain();
        System.out.println("Valid last name of user");
        String firstName = "Paunikar";
        Assert.assertTrue(obj.validateLastName(firstName));
    }
    @Test
    public void validateLastNameLowerCaseShouldFail() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid last name of user which contains only lowercase");
        String firstName = "paunikar";
        Assert.assertFalse(obj.validateLastName(firstName));
    }
    @Test
    public void validateLastNameLessThanThree() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid last name of user which having only three characters");
        String firstName = "pan";
        Assert.assertFalse(obj.validateLastName(firstName));
    }
    @Test
    public void validateEmailTest() {
        RegExMain obj = new RegExMain();
        System.out.println("Valid email id of user");
        String email = "shiwani12@gmail.com";
        Assert.assertTrue(obj.validEmail(email));
    }

    @Test
    public void validateEmailWithoutDomainShouldFail() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid email id of user without domain");
        String email = "shiwani12";
        Assert.assertFalse(obj.validEmail(email));
    }

    @Test
    public void validateEmailWithStartingFirstLetterCapitalShouldFail() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid email id of user having starting letter is capital");
        String email = "Shiwani12@gmail.com";
        Assert.assertFalse(obj.validEmail(email));
    }
    @Test
    public void validateMobileNoTest() {
        RegExMain obj = new RegExMain();
        System.out.println("Valid mobile no of user");
        String phoneNo = "+91 8908641811";
        Assert.assertTrue(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateMobileNoWithoutCountryCodeShouldFail() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid mobile no of user without country code");
        String phoneNo = "8908641811";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateMobileNoWithoutProperSimCodeShouldFail() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid mobile no of user without proper sim code");
        String phoneNo = "+91 6578641811";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateInvalidMobileNoShouldFail() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid mobile no of user which is more than 10 numbers");
        String phoneNo = "+91 65786418112";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }
}

