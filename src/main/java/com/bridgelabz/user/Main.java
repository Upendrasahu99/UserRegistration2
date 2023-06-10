package com.bridgelabz.user;

public class Main {
    public static void main(String[] args) {
        PatternCheck patternCheck = new PatternCheck();
        patternCheck.setFirstName("Raja");
        patternCheck.setEmail("Singh");
        patternCheck.setEmail("abc.xyz@bl.co.in");
        patternCheck.setMobileNumber("91 9457683476");
        patternCheck.setPassword("1223767859");
        System.out.println("First Name : " + patternCheck.checkFirstName.checkPattern());
        System.out.println("Last Name : " + patternCheck.checkFirstName.checkPattern());
        System.out.println("Email : " + patternCheck.checkEmail.checkPattern());
        System.out.println("Mobile Num : " + patternCheck.checkMobileNum.checkPattern());
        System.out.println("Password : " + patternCheck.checkPassword.checkPattern());
    }
}
