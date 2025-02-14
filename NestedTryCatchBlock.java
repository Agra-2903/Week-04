package org.example;

import java.util.Scanner;

public class NestedTryCatchBlock {

    public static void divideOperation(int[] arr, int index, int divisor) {
        try {
            int dividend = arr[index];
            try {
                System.out.println(dividend / divisor);
            }catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 5, 12, 6, 45};

        System.out.print("Enter the index: ");
        int index = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        divideOperation(arr, index, divisor);
    }
}
