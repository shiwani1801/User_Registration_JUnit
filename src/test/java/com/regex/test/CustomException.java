package com.regex.test;

import org.junit.Test;
import com.regex.assignments.InvalidUserDetailsException;
import com.regex.assignments.RegExMain;

public class CustomException {

    @Test
    public void validateFirstNameTest() {
        try
        {
            boolean result = RegExMain.validateFirstName("Shiw123");
            if (result != true)
            {
                throw new InvalidUserDetailsException("Invalid First Name");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void validateLastNameTest() {
        try
        {
            boolean result = RegExMain.validateLastName("Pauni123");
            if (result != true)
            {
                throw new InvalidUserDetailsException("Invalid Last Name");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void validateEmailTest() {
        try
        {
            boolean result = RegExMain.validEmail("shiwanisp675");
            if (result != true)
            {
                throw new InvalidUserDetailsException("Invalid Email id");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void validateMobileNoTest() {
        try
        {
            boolean result = RegExMain.validatePhoneNo("+91 89086418112");
            if (result != true)
            {
                throw new InvalidUserDetailsException("Invalid Phone no");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void validatePasswordTest() {
        try
        {
            boolean result = RegExMain.validatePassword("shiwani");
            if (result != true)
            {
                throw new InvalidUserDetailsException("Invalid Password");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}