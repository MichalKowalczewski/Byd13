package com.sda.przyklad3;

public class Order {

    Status status;

    public enum Status {
        ORDERED (5){
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        ON_ROUTE (2){
            @Override
            public boolean isOnRoute() {
                return true;
            }
        },
        DELIVERED (0){
            @Override
            public boolean isDelivered() {
                return true;
            }
        };
        private int timeToDelivery;

        Status (int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }

        public boolean isOrdered() {return false;}

        public boolean isOnRoute() {return false;}

        public boolean isDelivered(){return false;}

        public int getTimeToDelivery() {
            return timeToDelivery;
        }

    }


}
