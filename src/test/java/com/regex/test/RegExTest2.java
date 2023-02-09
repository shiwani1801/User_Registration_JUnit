package com.regex.test;

import com.regex.assignments.RegExMain;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class RegExTest2 {
    RegExMain obj = new RegExMain();

    @Test
    public void happyTest() {
        System.out.println("Valid first name, last name, email id, phone no and password of user");

        assertTrue(obj.validateFirstName(obj.firstName));
        assertTrue(obj.validateLastName(obj.lastName));
        assertTrue(obj.validEmail(obj.emailId));
        assertTrue(obj.validatePhoneNo(obj.phoneNo));
        assertTrue(obj.validatePassword(obj.password));
        System.out.println("Happy");
    }

    @Test
    public void sadTest() {

        assertFalse(obj.validateFirstName(obj.firstName));
        assertFalse(obj.validateLastName(obj.lastName));
        assertFalse(obj.validEmail(obj.emailId));
        assertFalse(obj.validatePhoneNo(obj.phoneNo));
        assertFalse(obj.validatePassword(obj.password));
        System.out.println("Invalid first name, last name, email id, phone no and password of user");
        System.out.println("Sad");
    }
}

