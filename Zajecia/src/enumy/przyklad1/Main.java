package enumy.przyklad1;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setStatus(Order.Status.ON_ROUTE);
        System.out.println(order.isDelivered());
        Order.Status.DELIVERED.getTimeToDelivery();
        Order.Status.DELIVERED.isPayed();
        Order.Status.ON_ROUTE.setTimeToDelivery(5);

        System.out.println(Order.Status.ON_ROUTE.getTimeToDelivery());


        Order.Status.ON_ROUTE.display();
        Order.Status.DELIVERED.display();
        Order.Status.ORDERED.display();
    }
}
