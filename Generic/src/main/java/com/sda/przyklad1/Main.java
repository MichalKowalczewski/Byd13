package com.sda.przyklad1;

public class Main {
    public static void main(String[] args) {

        Box<Integer> box = new Box<>();
        ObjectBox objectBox = new ObjectBox();

        box.setT(5);
        objectBox.setObject(5);
        Integer i = box.getT();
        Integer j = (Integer) objectBox.getObject();

        System.out.println(i);
        System.out.println(j);

    }
}
