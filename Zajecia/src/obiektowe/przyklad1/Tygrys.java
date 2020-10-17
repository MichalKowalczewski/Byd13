package obiektowe.przyklad1;

public class Tygrys extends Zwierze {

    public Tygrys() {
        super(4);
    }

    public void wyswietl() {
        System.out.println("Jestem Tygrys i mam "+getIloscLap() + " łapy");
    }
}
