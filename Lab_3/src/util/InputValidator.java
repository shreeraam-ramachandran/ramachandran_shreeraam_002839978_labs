/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Home
 */
public class InputValidator {
    
    public static boolean isValidName(String name) {
        return name.matches("[A-Za-z]+"); // Only alphabetic characters allowed
    }
    
    public static boolean isValidString(String str) {
    String regex = "^[A-Za-z0-9]+$"; //Only letters and numbers allowed

    // Check if the string matches the regex pattern
    return str != null && str.matches(regex);
}
    public static boolean isValidEmail(String email) {
        // Your validation logic for an email address
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}");
    }
    
    public static boolean isValidInteger(String input) {
    // Use a regular expression to match a string that consists of one or more digits
    return input.matches("\\d+");
    }
    
    public static boolean isValidDouble(String input) {
    // Use a regular expression to match a string that represents a valid double
        return input.matches("-?\\d+(\\.\\d+)?");
    }
    
    public static boolean isValidPassword(String password) {
    //Acceprs numbers an any case alphabets, min 5 and max 8 is the password length
    String regex = "^[a-zA-Z0-9]{5,8}$";

    // Check if the password matches the regex pattern
    return password.matches(regex);
    }
    public static boolean isValidURL(String url) {
    String regex = "^(https?|ftp)://[a-zA-Z0-9.-]+(\\.[a-zA-Z]{2,})?(:\\d+)?(/\\S*)?$";

    // Check if the URL matches the regex pattern
    return url != null && url.matches(regex);
    }
    
    public static boolean isValidMobileNumber(String phoneNumber) {
    String regex = "^(\\+\\d{1,3}[- ]?)?\\d{10}$";

    // Check if the phoneNumber matches the regex pattern
    return phoneNumber != null && phoneNumber.matches(regex);
}
    
}
