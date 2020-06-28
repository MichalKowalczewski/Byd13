package com.sda.zadanie;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;

public class MyList<T> extends ArrayList<T> {

    public void forEachBackwards(Consumer<T> blabla){
        Objects.requireNonNull(blabla);
        for (int i=this.size()-1; i>=0; i--){
            blabla.accept(this.get(i));
        }
    }
}
