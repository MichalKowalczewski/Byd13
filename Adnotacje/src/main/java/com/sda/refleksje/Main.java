package com.sda.refleksje;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class cl = null;
        try {
            cl = Class.forName("com.sda.refleksje.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        User user = null;
        try {
            user = (User) cl.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        for(Method m:cl.getDeclaredMethods()){
            System.out.println(m.getName());
            try {
                System.out.println("wywołuje metode");
                m.invoke(user);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        try {
            Method method = cl.getDeclaredMethod("notHello");
            method.invoke(user);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
