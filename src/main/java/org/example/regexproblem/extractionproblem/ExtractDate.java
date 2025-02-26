package org.example.regexproblem.extractionproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDate {
    public static void extractDate(String str) {
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {

        String str = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        extractDate(str);
    }
}
