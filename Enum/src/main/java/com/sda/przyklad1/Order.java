package com.sda.przyklad1;

public class Order {

    private Status status;

    public enum Status{
        ORDERED,
        ON_ROUTE,
        DELIVERED
    }

    //Jako że mamy pewność że JVM istnieje tylko jeden enum
    //danego typu, możemy używać == nie ma konieczności korzystania
    //z .equals()
    public boolean isDelivered(){
        if (getStatus() == Status.DELIVERED){
            return true;
        }
        else {
            return false;
        }
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
