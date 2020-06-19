package com.sda.przyklad1;

@FunctionalInterface
public interface Example {
    int execute(int a, int b);

    default void display(){
        System.out.println("metody default mogą być zadeklarowane w interfejsach funkcyjnych");
    }
}
