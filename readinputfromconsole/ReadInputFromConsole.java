package org.example.readinputfromconsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputFromConsole {

    public static void fileWriter(String filePath) {
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fw = new FileWriter(filePath);
        ) {
            System.out.println("Enter name, age and favourite programming language in one line (type 'exit' to stop):");

            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(line);
                fw.write("\n");
            }

            System.out.println("Input saved to " + filePath);

        }catch (IOException e) {
            System.out.println("Enter valid input");
        }
    }

    public static void main(String[] args) {
        String filePath = "C:\\College\\Capgemini\\Week04\\Day03\\src\\main\\java\\org\\example\\readinputfromconsole\\output";

        fileWriter(filePath);
    }
}
