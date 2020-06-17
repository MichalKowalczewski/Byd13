package com.sda.zadanie1;

public class ProgramistaSenior extends Programista {

    int litrówWypitejKawy;

    public ProgramistaSenior(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek, pensja);
    }

    public int getLitrówWypitejKawy() {
        return litrówWypitejKawy;
    }

    public void setLitrówWypitejKawy(int litrówWypitejKawy) {
        this.litrówWypitejKawy = litrówWypitejKawy;
    }

    @Override
    public void describe() {
        System.out.println("Jestem Programistą Seniorem, nazywam się: "+getImie()+" "+getNazwisko()+" i mam "+getWiek()+" lat");
    }


}
