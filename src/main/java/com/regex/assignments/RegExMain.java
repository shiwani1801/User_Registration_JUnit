package com.regex.assignments;

import java.util.regex.Pattern;

public class RegExMain {
    public String firstName = "Shiwani";
    public String lastName = "Paunikar";
    public String emailId = "shiwani12@gmail.com";
    public String phoneNo = "+91 8908641811";
    public String password = "Shiwani@123";


    public static boolean validateFirstName(String firstName) {
        return Pattern.matches("[A-Z][a-z]{3,}",firstName);
    }
    public static boolean validateLastName(String lastName) {
        return Pattern.matches("[A-Z][a-z]{3,}",lastName);
    }
    public static boolean validEmail(String email) {
        return Pattern.matches("^[a-z0-9+_.-]+@+[a-z]+.+[a-z]+.+[a-z]$",email);
    }
    public static boolean validatePhoneNo(String phoneNo) {
        return Pattern.matches("^\\++[91]+\\s+[789]\\d{9}$",phoneNo);
    }
    public static boolean validatePassword(String password) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$",password);
    }
}