package com.sda.funkcyjne.zadanie3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;

public class MyList<E> extends ArrayList<E> {

    public void forEachBackwards(Consumer<E> c){
        Objects.requireNonNull(c);
        for(int i=this.size()-1; i>=0; i--){
            c.accept(this.get(i));
        }
    }
}
