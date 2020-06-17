package com.sda.adnotacje;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Class cl = null;
        try {
            cl = Class.forName("com.sda.adnotacje.User");
            if(cl.isAnnotationPresent(Database.class)){
                Database database = (Database) cl.getAnnotation(Database.class);
                System.out.println(database.value());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}
