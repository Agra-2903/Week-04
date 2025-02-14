package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void exceptionTest(String filePath) {
        try(
                BufferedReader bis = new BufferedReader(new FileReader(filePath))
        ) {
            String line;
            while((line = bis.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
    public static void main(String[] args) {
        String filePath1 = "src/main/java/org/example/input";
        String filePath2 = "";
        exceptionTest(filePath1);
        exceptionTest(filePath2);
    }
}
