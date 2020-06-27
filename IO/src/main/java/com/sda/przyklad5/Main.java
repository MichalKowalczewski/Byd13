package com.sda.przyklad5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("przyklad/aaaa");
            Path path2 = Paths.get("przyklad2/aaaa");
            Path path3 = Paths.get("przyklad2");
            System.out.println(path);
            Files.createDirectory(path3);
            Files.copy(path, path2);
            Files.move(path, path2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
