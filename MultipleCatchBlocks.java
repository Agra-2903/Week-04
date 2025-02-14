package org.example;

import java.util.Scanner;

public class MultipleCatchBlocks {
    static Scanner sc = new Scanner(System.in);

    public static void findElement(int[] arr, int index) {
        try {
            System.out.println("Element at " + index + " is: " + arr[index]);
        }catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = (n > 0) ? new int[n] : null;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        findElement(arr, index);
    }
}
