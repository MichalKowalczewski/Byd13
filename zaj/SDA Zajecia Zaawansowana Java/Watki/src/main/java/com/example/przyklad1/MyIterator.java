package com.example.przyklad1;

public class MyIterator implements Runnable {

    private int number;

    public MyIterator(Integer startingNumber){
        this.number=startingNumber;
    }

    private void iterate(){
        for (; number<10; number++){
            System.out.println("Watek "+Thread.currentThread().getName()+
                    " Wartosc number: " +number);
        }
    }


    public void run() {
        iterate();
    }
}
