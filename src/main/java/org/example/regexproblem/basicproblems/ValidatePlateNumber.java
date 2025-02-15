package org.example.regexproblem.basicproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePlateNumber {
    public static void validatePlateNumber(String plateNumber) {
        String regex = "^[A-Z]{2}[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(plateNumber);

        if(matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the plateNumber: ");
        String plateNumber = sc.next();

        validatePlateNumber(plateNumber);
    }
}
