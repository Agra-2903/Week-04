package org.example.regexproblem.advancedproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {
    public static void extractProgrammingLanguage(String str) {
        String[] programmingLanguage = {"java", "python", "javascript", "go"};

        String programmingLanguagePattern = String.join("|", programmingLanguage);

        String regex = "(?i)\\b(" + programmingLanguagePattern + ")\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        extractProgrammingLanguage(text);
    }
}
