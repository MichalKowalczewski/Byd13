package com.sda.przyklad4;

import java.io.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class BazaFilmow {
    File plik = new File("files" + File.separator + "filmy.txt");
    String line;

    public List<Film> wczytajFilmy() {
        List<Film> listaFilmów = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(plik))) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] splittedLine = line.split(";");
                listaFilmów.add(new Film(splittedLine[0], splittedLine[1], splittedLine[2], Year.parse(splittedLine[3])));
            }
            return listaFilmów;
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
        return null;
    }

    public void zapiszFilm(Film film) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(plik, true))) {
            bufferedWriter.append(film.toString() + "\n");
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
    }


/*
    public void usunFilm(String tytul) {
        List<Film> filmy = wczytajFilmy();
        Iterator<Film> i = filmy.iterator();

        //i.next() zwraca nam kolejny obiekt z listy
        while (i.hasNext()) {
            Film film = i.next();
            if (film.getTytul().equals(tytul)) {
                i.remove();
            }
        }

        // Dlaczego to jest złe ?
        //for (Film film:filmy){
        //    if (film.getTytul().equals(tytul)){
        //        filmy.remove(film);
        //    }
        //}

        //Ustawiamy w Writerze append na false, żeby uniemożliwić "dokładanie do pliku"
        //Moglibyśmy także BufferedWritera zainicjalizować na górze, pozostawić append
        //i zamiast bufferedWriter.append() zastosować bufferedWriter.write - z wykorzystaniem StringBuildera
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(plik, false))) {
            StringBuilder sb = new StringBuilder();
            for (Film film : filmy) {
                bufferedWriter.append(film.toString() + "\n");
                //sb.append(film.toString() + "\n");
            }
            //bufferedWriter.write(sb.toString());
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
    }*/
}
