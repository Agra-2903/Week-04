package org.example.regexproblem.extractionproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void extractEmail(String str) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {


        String str = "Contact us at support@example.com and info@company.org";

        extractEmail(str);
    }
}
