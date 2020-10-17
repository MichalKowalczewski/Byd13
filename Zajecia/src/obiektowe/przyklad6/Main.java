package obiektowe.przyklad6;

public class Main {
    public static void main(String... args) {
        Przyklad przyklad = new Przyklad();
        przyklad.display(1);
        przyklad.display((byte) 1);
        przyklad.display("s");
        przyklad.display(new Integer(2));
        przyklad.display(Integer.valueOf(2));
        przyklad.display(2,2);
        przyklad.display(1,2,3,4);
        przyklad.display(2.9);
    }
}
