package com.regex.test;

import com.regex.assignments.InvalidUserDetailsException;
import com.regex.assignments.RegExMain;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RegExTest {
    RegExMain obj = new RegExMain();
    List<String> emailList = new ArrayList<>();

    @BeforeClass
    public static void welcomeText() {
        System.out.println("Welcome to User Registration Problem");

    }
    @Test
    public void validateFirstNameTest() throws InvalidUserDetailsException {
        System.out.println("Valid first name of user");
        String firstName = "Shiwani";
        Assert.assertTrue(obj.validateFirstName(firstName));
    }
    @Test
    public void validateFirstNameLowerCaseShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid first name of user which contains only lowercase");
        String firstName = "shiwani";
        Assert.assertFalse(obj.validateFirstName(firstName));
    }
    @Test
    public void validateFirstNameLessThanThree() throws InvalidUserDetailsException {
        System.out.println("Invalid first name of user which having only three characters");
        String firstName = "Shi";
        Assert.assertFalse(obj.validateFirstName(firstName));
    }
    @Test
    public void validateLastNameTest() throws InvalidUserDetailsException {
        System.out.println("Valid last name of user");
        String firstName = "Paunikar";
        Assert.assertTrue(obj.validateLastName(firstName));
    }
    @Test
    public void validateLastNameLowerCaseShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid last name of user which contains only lowercase");
        String firstName = "paunikar";
        Assert.assertFalse(obj.validateLastName(firstName));
    }
    @Test
    public void validateLastNameLessThanThree() throws InvalidUserDetailsException {
        System.out.println("Invalid last name of user which having only three characters");
        String firstName = "pan";
        Assert.assertFalse(obj.validateLastName(firstName));
    }
    @Test
    public void validateEmailTest() throws InvalidUserDetailsException {
        System.out.println("Valid email id of user");
        String email = "shiwani12@gmail.com";
        Assert.assertTrue(obj.validEmail(email));
    }

    @Test
    public void validateEmailWithoutDomainShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid email id of user without domain");
        String email = "shiwani12";
        Assert.assertFalse(obj.validEmail(email));
    }

    @Test
    public void validateEmailWithStartingFirstLetterCapitalShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid email id of user having starting letter is capital");
        String email = "Shiwani12@gmail.com";
        Assert.assertFalse(obj.validEmail(email));
    }
    @Test
    public void validateMobileNoTest() throws InvalidUserDetailsException {
        System.out.println("Valid mobile no of user");
        String phoneNo = "+91 8908641811";
        Assert.assertTrue(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateMobileNoWithoutCountryCodeShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid mobile no of user without country code");
        String phoneNo = "8908641811";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateMobileNoWithoutProperSimCodeShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid mobile no of user without proper sim code");
        String phoneNo = "+91 6578641811";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateInvalidMobileNoShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid mobile no of user which is more than 10 numbers");
        String phoneNo = "+91 65786418112";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }
    @Test
    public void validatePasswordTest() throws InvalidUserDetailsException {
        System.out.println("Valid password of user");
        String password = "Shiwani@123";
        Assert.assertTrue(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordLimitLowerThanEightCharactersShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid password of user which contains minimum 8 characters");
        String password = "Shiwani@";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordTestLimitGreaterThanTwentyCharactersShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid password of user which contains more than 20 characters");
        String password = "Shiwani@1234567890ghfdc";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordWithoutUpperCaseShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid password of user which doesn't contains any upper case");
        String password = "shiwani@123";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordWithoutNumericNumberShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid password of user which doesn't contains any upper case");
        String password = "Shiwanis@";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordWithoutSpecialCharacterShouldFail() throws InvalidUserDetailsException {
        System.out.println("Invalid password of user which doesn't contains special character");
        String password = "Shiwani123";
        Assert.assertFalse(obj.validatePassword(password));
    }
    @Test
    public void validateSampleEmailTest() {
        System.out.println("Validate some sample email ids");
        emailList.add("abc@yahoo.com");
        emailList.add("abc-100@yahoo.com");
        emailList.add("abc111@abc.com");
        emailList.add("abc.100@yahoo.com");
        emailList.add("abc-100@abc.net");
        emailList.add("abc.100@abc.com.au");
        emailList.add("abc@1.com");
        emailList.add("abc@gmail.com.com");
        emailList.add("abc+100@gmail.com");
        for (int i = 0; i < emailList.size(); i++)
        {
            try
            {
                Assert.assertTrue(obj.validEmail(emailList.get(i)));
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                emailList.remove(i);
            }
        }
    }
}



