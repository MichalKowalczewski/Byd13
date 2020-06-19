package com.sda.funkcyjne.przyklad3;

import java.util.Optional;

public class Example {

    public void display(Optional<String> optional){
        String string = optional.orElse("Domyślna wartość");
        System.out.println(string);
    }

}
