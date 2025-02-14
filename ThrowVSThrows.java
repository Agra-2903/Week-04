package org.example;

import java.util.Scanner;

public class ThrowVSThrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the principal amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter the interest rate (in %): ");
            double rate = sc.nextDouble();

            System.out.print("Enter the number of years: ");
            int years = sc.nextInt();

            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        } finally {
            sc.close();
        }
    }

    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0 || years < 0) {
            throw new IllegalArgumentException("Amount or rate cannot be negative");
        }
        return (amount * rate * years) / 100;
    }
}
