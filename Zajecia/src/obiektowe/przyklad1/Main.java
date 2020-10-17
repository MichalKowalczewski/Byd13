package obiektowe.przyklad1;

public class Main {
    public static void main(String[] args) {
        Tygrys tygrys = new Tygrys();
        tygrys.wyswietl();

        tygrys.setIloscLap(3);
        tygrys.wyswietl();
        Zwierze zwierze = new Tygrys();
        System.out.println(zwierze.getIloscLap());
    }
}
