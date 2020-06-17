package com.sda.zadanie1;

import java.lang.reflect.Method;
import java.text.Annotation;

public class Main {
    public static void main(String[] args) {
        Class cl = User.class;
        for (Method method : cl.getMethods()){
            if(method.isAnnotationPresent(Example.class)){
                Example annotation = method.getAnnotation(Example.class);
                System.out.println("annotation value is: "+annotation.value());
                System.out.println("my number is: "+annotation.myNumber());

            }
        }
    }
}
