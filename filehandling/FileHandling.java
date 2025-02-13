package org.example.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

    public static void exampleTest(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             FileOutputStream fos = new FileOutputStream("C:\\College\\Capgemini\\Week04\\Day03\\src\\main\\java\\org\\example\\filehandling\\output")) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Input file not available");
        }

    }

    public static void main(String[] args) {
        String filePath = "C:\\College\\Capgemini\\Week04\\Day03\\src\\main\\java\\org\\example\\filehandling\\input";

        exampleTest(filePath);
    }
}
