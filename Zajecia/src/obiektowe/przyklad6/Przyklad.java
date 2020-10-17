package obiektowe.przyklad6;

public class Przyklad {

    public void display() {
        System.out.println("zwykly display");
    }

    public String display(double a){
        return "test";
    }

    public void display(String a) {
        System.out.println("Ze stringiem");
    }

    public void display(int i) {
        System.out.println("Z intem");
    }

    public void display (int... i) {
        System.out.println("vararg");
    }

    public void display(int i, int j) {
        System.out.println("2 argumenty");
    }

    public void display(short i) {
        System.out.println("Z short");
    }

    public void display(Integer integer) {
        System.out.println("Z wrapperem");
    }

    public void display(byte i) {
        System.out.println("Z byte");
    }

}
