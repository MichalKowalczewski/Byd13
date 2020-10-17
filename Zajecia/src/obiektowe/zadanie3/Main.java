package obiektowe.zadanie3;

public class Main {
    public static void main(String[] args) {

        Figura[] figury = {new Kolo(5),
                new Kwadrat(3),
                new Prostokat(3,5)};
        double sumaPolPowierzchni = 0;
        for (Figura f : figury) {
            sumaPolPowierzchni+=f.obliczPole();
        }
        System.out.println(sumaPolPowierzchni);

    }
}
