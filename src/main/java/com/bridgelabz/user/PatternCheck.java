package com.bridgelabz.user;

import java.util.regex.Pattern;

public class PatternCheck extends UserDetail{
    CheckPattern checkFirstName = () -> Pattern.matches("[A-Z][a-z]{2,}",getFirstName());
    CheckPattern checkLastName = () -> Pattern.matches("[A-Z][a-z]{2,}",getLastName());
    CheckPattern checkEmail = () ->  Pattern.matches("[a-z0-9]+[.]?+[a-z]?+@+[a-z]+[.]+[co]+[.]+[in]?",getEmail());
    CheckPattern checkMobileNum = () -> Pattern.matches("[91]+[\\s]+[1-9]+[0-9]{9}",getMobileNumber());
    CheckPattern checkPassword = () -> Pattern.matches("^.{8,}$",getPassword());
}
