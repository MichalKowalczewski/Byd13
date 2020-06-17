package com.sda.przyklad1;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setStatus(Order.Status.DELIVERED);
        System.out.println(order.isDelivered());

        switch (order.getStatus()){
            case DELIVERED:
                System.out.println("dostarczono");
                break;
            case ORDERED:
                System.out.println("zamówiono");
                break;
            case ON_ROUTE:
                System.out.println("W drodze");
                break;
        }
    }
}
