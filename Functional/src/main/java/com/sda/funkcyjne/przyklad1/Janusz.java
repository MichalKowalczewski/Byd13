package com.sda.funkcyjne.przyklad1;

public class Janusz {

    public void zrobJanusza(String s){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.append(" Janusz");
        System.out.println(stringBuilder.toString());
    }

    public void zrobJanusza(){
        System.out.println("Janusz");
    }

}
