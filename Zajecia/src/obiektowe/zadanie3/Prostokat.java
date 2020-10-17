package obiektowe.zadanie3;

public class Prostokat extends Kwadrat {

    double b;

    public Prostokat(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    public double obliczPole() {
        return getA()*b;
    }

    @Override
    public double obliczObwod() {
        return 2*(getA()+b);
    }
}
