package com.sda.przyklad1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String thisLine;
        File sourceFile = new File("files/sourceFile.txt");
        File destinationFile = new File("files/destinationFile.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile, true))) {
            while ((thisLine=br.readLine()) != null){
                System.out.println(thisLine);
                bw.append(thisLine + System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
