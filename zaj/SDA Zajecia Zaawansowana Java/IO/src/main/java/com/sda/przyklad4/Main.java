package com.sda.przyklad4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Film> serializedFilmList = new ArrayList<>();
        serializedFilmList.add(new Film("Braveheart", "Mel Gibson", "Historyczny", 1999));
        serializedFilmList.add(new Film("Cos", "Innego", "Inny", 2020));

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("files/filmy.txt"))) {
           outputStream.writeObject(serializedFilmList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("files/filmy.txt"))) {
            List<Film> deserializedFilmList = (List<Film>) inputStream.readObject();
            deserializedFilmList.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
