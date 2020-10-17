package enumy.przyklad1;

public class Order {

    private Status status;

    public enum Status {
        ORDERED(3, false) {
            @Override
            public void display() {
                System.out.println("Zamówione");
            }
        },
        ON_ROUTE(1, true) {
            public void display() {
                System.out.println("W drodze");
            }
        },
        DELIVERED(0, true);

        private int timeToDelivery;
        private boolean isPayed;
        Status (int timeToDelivery, boolean isPayed) {
            this.timeToDelivery = timeToDelivery;
            this.isPayed = isPayed;
        }

        public void display() {
            System.out.println("Domyślny display");
        }

        public int getTimeToDelivery() {
            return timeToDelivery;
        }

        public boolean isPayed() {
            return isPayed;
        }

        public void setTimeToDelivery(int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }

        public void setPayed(boolean payed) {
            isPayed = payed;
        }
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isDelivered(){
        if (getStatus()==Status.DELIVERED){
            return true;
        }
        else {
            return false;
        }
    }

}
