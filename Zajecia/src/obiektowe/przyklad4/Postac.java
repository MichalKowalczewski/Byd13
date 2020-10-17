package obiektowe.przyklad4;

import java.util.Random;

public interface Postac extends ZywyObiekt {

    String LOKACJA_STARTOWA = "Tawerna";

    void walcz();

    default String nazwaInterfejsu() {return "Postac";}

    default int iloscPz() {return wygenerujPz();}

    private int wygenerujPz(){
        Random random = new Random();
        //Szukamy wartości między 6 a 10 :P
        //10 to maksymalna wartość, 6 to minimalna - random generuje liczby podobnie jak
        //indeksujemy tablice-tak więc w przypadku bound = 5-liczby będą generowane od 0 do 4
        //w tym przypadku losujemy liczbę od 0 do 4 i zawsze dodajemy do niej 6 - czyli
        //zakres będzie 6-10
        return random.nextInt((10-6)+1)+6;
    }

}
