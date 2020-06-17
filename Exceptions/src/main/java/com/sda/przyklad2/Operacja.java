package com.sda.przyklad2;

import java.util.Random;

public class Operacja {

    Random random = new Random();

    public void operuj() throws MyException {
        System.out.println("Zaczynam operację");
        int szansaNaBlad = random.nextInt(10);
        if (szansaNaBlad>5){
            popelnijBlad();
        }
    }

    private void popelnijBlad() throws MyException{
        MyException exception = new MyException("przeciąłeś tętnicę");
        throw exception;
    }
}
