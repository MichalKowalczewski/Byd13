package com.sdacademy.watki.sync;

public class ListReader implements Runnable  {

    ListOperator operator;

    public ListReader(ListOperator operator) {
        this.operator = operator;
    }

    @Override
    public void run() {
        operator.czytajListe();
    }
}
