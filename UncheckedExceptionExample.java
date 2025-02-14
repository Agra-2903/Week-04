package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionExample {

    public static void divideOperation(int dividend, int divisor) {
        try {
            System.out.println(dividend / divisor);
        } catch (ArithmeticException e) {
            System.out.println("Divisor can't be Zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the dividend: ");
            int dividend = sc.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = sc.nextInt();

            divideOperation(dividend, divisor);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}
