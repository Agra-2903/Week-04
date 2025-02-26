package org.example.regexproblem.basicproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {

    public static void validateColorCode(String colorCode) {
        String regex = "^#[a-zA-Z0-9]{6}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(colorCode);

        if(matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hex Color code: ");
        String colorCode = sc.next();

        validateColorCode(colorCode);
    }
}
