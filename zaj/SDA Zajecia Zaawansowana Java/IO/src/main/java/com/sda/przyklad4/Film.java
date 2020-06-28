package com.sda.przyklad4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Film implements Serializable {

    private String tytul;
    private String rezyser;
    private String gatunek;
    private int rok;

    @Override
    public String toString(){
        return tytul+";"+rezyser+";"+gatunek+";"+rok;
    }

}
