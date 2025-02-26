package org.example.regexproblem.extractionproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWord {
    public static void extractCapitalizedWord(String str) {
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {

        String str = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        extractCapitalizedWord(str);
    }
}
