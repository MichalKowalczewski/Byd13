package obiektowe.zadanie3;

public class Kwadrat implements Figura {

    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double obliczPole() {
        //return a*a
        return Math.pow(a, 2);
    }

    @Override
    public double obliczObwod() {
        return 4*a;
    }
}
