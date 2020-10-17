package exceptions.przyklad1;

public class Main {
    public static void main(String[] args) {

        Przyklad przyklad = new Przyklad();
        try {
            przyklad.test();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
