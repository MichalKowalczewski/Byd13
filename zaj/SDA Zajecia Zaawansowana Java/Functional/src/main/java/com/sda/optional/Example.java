package com.sda.optional;

import java.util.Optional;

public class Example {

    public void display(Optional<String> optional){
        String string = optional.orElse("Domyślna Wartość");
        System.out.println(string);
    }

    public void display(String optionalString){
        String string;
        if (optionalString == null){
            string = "domyslan wartosc";
        }
        else {
            string = optionalString;
        }
        System.out.println(string);
    }

}
