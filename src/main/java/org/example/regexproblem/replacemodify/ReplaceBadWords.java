package org.example.regexproblem.replacemodify;

public class ReplaceBadWords {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";

        String[] badWords = {"damn", "stupid"};

        String badWordsPattern = String.join("|", badWords);

        String output = input.replaceAll("(?i)\\b(" + badWordsPattern + ")\\b", "****");

        System.out.println(output);
    }
}

