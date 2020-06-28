package com.sda.przyklad5;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("przyklad2");
            Path path2 = Paths.get("przyklad/test");
            Path path3 = Paths.get("przyklad/test2");
            Path path4 = Paths.get("przyklad2/test");

            if (Files.notExists(path)) {
                Files.createDirectory(path);
            }
            //Files.copy(path2, path3);
            Files.move(path2, path4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
