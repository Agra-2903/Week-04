package org.example.regexproblem.replacemodify;

public class ReplaceMultipleSpaces {
    public static void removeExtraSpaces(String text) {
        String replacedText = text.replaceAll("\\s+", " ");

        System.out.println("Original: " + text);
        System.out.println("Formatted: " + replacedText);

    }

    public static void main(String[] args) {
        String text = "This    is  an     example   with  multiple spaces.";

        removeExtraSpaces(text);
    }
}
