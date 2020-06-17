package com.sda.przyklad1;

public class Box<T> {

    T objectT;

    public T getT(){
        return objectT;
    }

    public void setT(T t){
        this.objectT=t;
    }

}
