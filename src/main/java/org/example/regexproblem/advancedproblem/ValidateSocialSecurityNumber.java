package org.example.regexproblem.advancedproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurityNumber {
    public static void validateSSN(String str) {
        String regex = "\\b(\\d){3}-(\\d){2}-(\\d){4}\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        if(matcher.find()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {

        String str = "My SSN is 123-45-6789.";

        validateSSN(str);
    }
}
