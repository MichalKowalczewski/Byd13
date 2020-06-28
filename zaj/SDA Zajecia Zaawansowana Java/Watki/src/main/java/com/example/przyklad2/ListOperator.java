package com.example.przyklad2;

public class ListOperator implements Runnable {
    private ListReader reader;

    public ListOperator(ListReader reader) {
        this.reader = reader;
    }

    @Override
    public void run() {
        reader.czytajListe();
    }
}
