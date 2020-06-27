package com.sda.przyklad2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (
                FileReader in = new FileReader("files/sourceFile.txt");
                FileWriter out = new FileWriter("files/destinationFile.txt")) {
            int c;
            int nextChar;
            while ((nextChar = in.read()) != -1) {
                char character = (char) nextChar;
                System.out.println(character);
                out.append(character);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



