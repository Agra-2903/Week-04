package org.example.regexproblem.advancedproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void validateUsername(String username) {
        String regex = "^(4\\d{15})|(5\\d{15})$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(username);

        if(matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the username: ");
        String username = sc.next();

        validateUsername(username);
    }
}
