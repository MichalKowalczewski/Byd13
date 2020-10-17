package obiektowe.zadanie3;

public class Kolo implements Figura {

    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double obliczObwod() {
        return 2*Math.PI*r;
    }
}
