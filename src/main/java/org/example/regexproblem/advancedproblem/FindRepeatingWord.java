package org.example.regexproblem.advancedproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWord {
    public static void findRepeatingWords(String str) {
        String regex = "\\b(\\w+)\\s\\1\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }

    public static void main(String[] args) {

        String str = "This is is a repeated repeated word test.";

        findRepeatingWords(str);
    }
}
