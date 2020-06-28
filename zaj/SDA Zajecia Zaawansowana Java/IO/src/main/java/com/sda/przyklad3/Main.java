package com.sda.przyklad3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {
    //NIO
    public static void main(String[] args) {
        try {
            List<String> list = Files.readAllLines(Paths.get("files","sourceFile.txt"));
            Files.write(Paths.get("files","destinationFile.txt"), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
