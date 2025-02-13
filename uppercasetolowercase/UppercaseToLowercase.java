package org.example.uppercasetolowercase;

import java.io.*;

public class UppercaseToLowercase {
    public static void main(String[] args) {
        try(
                FileReader fr = new FileReader("C:\\College\\Capgemini\\Week04\\Day03\\src\\main\\java\\org\\example\\uppercasetolowercase\\input");
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("C:\\College\\Capgemini\\Week04\\Day03\\src\\main\\java\\org\\example\\uppercasetolowercase\\output");
                BufferedWriter bw = new BufferedWriter(fw)){
            String line;
            while((line = br.readLine())!=null){
                bw.write(line.toLowerCase());
                bw.newLine();
            }
            System.out.println("File conversion successfull");
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }
}
