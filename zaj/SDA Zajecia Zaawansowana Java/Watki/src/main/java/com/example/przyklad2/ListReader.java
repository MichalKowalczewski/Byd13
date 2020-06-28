package com.example.przyklad2;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ListReader {
    private List<String> listaTekstu;

    Lock lock = new ReentrantLock();

    public ListReader(List<String> listaTekstu) {
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
