package org.example.bufferedstreams;

import java.io.*;

public class BufferedStreams {

    public static void usingBufferedStream(String filePath) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\College\\Capgemini\\Week04\\Day03\\src\\main\\java\\org\\example\\bufferedstreams\\output"))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully with buffering.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void usingFileStream(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             FileOutputStream fos = new FileOutputStream("C:\\College\\Capgemini\\Week04\\Day03\\src\\main\\java\\org\\example\\bufferedstreams\\output")) {

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
        String filePath = "C:\\College\\Capgemini\\Week04\\Day03\\src\\main\\java\\org\\example\\bufferedstreams\\input";

        long startTime = System.nanoTime();
        usingFileStream(filePath);
        long endTime = System.nanoTime();
        System.out.println("Time taken by File stream: " + (endTime - startTime));

        startTime = System.nanoTime();
        usingBufferedStream(filePath);
        endTime = System.nanoTime();
        System.out.println("Time taken by Buffered stream: " + (endTime - startTime));
    }
}
