package com.regex.test;

import com.regex.assignments.RegExMain;
import org.junit.Assert;
import org.junit.*;

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
}