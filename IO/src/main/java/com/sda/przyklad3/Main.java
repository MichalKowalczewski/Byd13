package com.sda.przyklad3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("files", "sourceFile.txt"));
            Files.write(Paths.get("files", "destinationFile.txt"), lines);
        } catch (IOException e) {
            System.err.println("Blad podczas czytania pliku!");
        }
    }
}
