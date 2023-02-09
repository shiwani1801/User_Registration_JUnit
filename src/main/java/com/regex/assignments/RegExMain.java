package com.regex.assignments;

import java.util.regex.Pattern;

public class RegExMain {
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("[A-Z][a-z]{3,}",firstName);
    }
    public boolean validateLastName(String lastName) {
        return Pattern.matches("[A-Z][a-z]{3,}",lastName);
    }
    public boolean validEmail(String email) {
        return Pattern.matches("^[a-z0-9+_.-]+@+[a-z]+.+[a-z]+.+[a-z]$",email);
    }
    public boolean validatePhoneNo(String phoneNo) {
        return Pattern.matches("^\\++[91]+\\s+[789]\\d{9}$",phoneNo);
    }
    public boolean validatePassword(String password) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$",password);
    }
}