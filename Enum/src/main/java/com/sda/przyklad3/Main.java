package com.sda.przyklad3;

public class Main {
    public static void main(String[] args) {

        for (Order.Status status : Order.Status.values()) {
            System.out.println(status.isDelivered());
            System.out.println(status.isOnRoute());
            System.out.println(status.getTimeToDelivery());
        }



    }
}
