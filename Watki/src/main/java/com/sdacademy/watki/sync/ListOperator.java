package com.sdacademy.watki.sync;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ListOperator {
    private List<String> listaTekstu;

    Lock lock = new ReentrantLock();

    public ListOperator(List<String> listaTekstu) {
        this.listaTekstu = listaTekstu;
    }


    public void czytajListe(){
        //synchronized (this) {
            lock.lock();
            for (String s : listaTekstu) {
                System.out.println(s + " " + Thread.currentThread().getName());
            }
            lock.unlock();
        //}

    }
}
