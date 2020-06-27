package com.sda.przyklad4;

import java.io.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BazaFilmow bazaFilmow = new BazaFilmow();

        List<Film> serializedFilmList = new ArrayList<>();
        serializedFilmList.add(new Film("Braveheart", "Mel Gibson", "Historyczny", Year.parse("1999")));
        serializedFilmList.add(new Film("Cos", "Innego", "Inny", Year.parse("2019")));

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("files"+ File.separator+"filmy.txt"));
            outputStream.writeObject(serializedFilmList);
        }
        catch (FileNotFoundException e){
            System.err.println("Error: "+e);;
        }
        catch (IOException e){
            System.err.println("Error: "+e);
        }

        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("files"+File.separator+"filmy.txt"));
            List<Film> deserializedFilmList = (List<Film>) inputStream.readObject();
            deserializedFilmList.forEach(film -> System.out.println(film));
        }

        catch (FileNotFoundException e){
            System.err.println("Error: "+e);
        }
        catch (IOException e){
            System.err.println("Error: "+e);
        }
        catch (ClassNotFoundException e){
            System.err.println("Error: "+e);
        }
    }

}
