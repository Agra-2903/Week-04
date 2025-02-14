package org.example;

import java.io.*;

public class CheckedExceptionExample {

    public static void exceptionTest(String filePath) {
        try(
                BufferedReader bis = new BufferedReader(new FileReader(filePath))
        ) {
            String line;
            while((line = bis.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println("File not found");
        }
    }
    public static void main(String[] args) {
        String filePath1 = "C:\\College\\Capgemini\\Week04\\Day04\\src\\main\\java\\org\\example\\input";
        String filePath2 = "";
        exceptionTest(filePath1);
        exceptionTest(filePath2);
    }
}
