package org.example.junitproblem.basicproblems;

public class StringUtilMethods {

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed); // case-insensitive comparison
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}

