package com.sda.przyklad4;

//Klasa nie rozszerza innej klasy, a implementuje interfejs - występuje różnica w nazewnictwie
public class Mag implements Postac {

    public void uzyjMagii(){
        System.out.println("zadano 8 obrazen");
    }

    @Override
    public void walcz() {
        uzyjMagii();
    }

    @Override
    public void umrzyj() {
        System.out.println("Umieram");
    }
}
