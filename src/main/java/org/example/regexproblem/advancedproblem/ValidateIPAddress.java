package org.example.regexproblem.advancedproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void validateIPAddress(String address) {
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(address);

        if(matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the IPv4 address: ");
        String address = sc.next();

        validateIPAddress(address);
    }
}
