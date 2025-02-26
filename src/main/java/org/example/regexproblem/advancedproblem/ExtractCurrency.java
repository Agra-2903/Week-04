package org.example.regexproblem.advancedproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {
    public static void extractCurrency(String str) {
        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {

        String str = "The price is $45.99, and the discount is 10.50.";

        extractCurrency(str);
    }
}
