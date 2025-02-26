package org.example.regexproblem.extractionproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {
    public static void extractLink(String str) {
        String regex = "\\bhttps?://(www\\.)?[a-zA-Z0-9.-]+\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {

        String str = "Visit https://www.google.com and http://example.org for more info.";

        extractLink(str);
    }
}
