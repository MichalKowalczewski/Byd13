package obiektowe.przyklad4;

public class Main {
    public static void main(String[] args) {
        Postac postac = new Wojownik();
        Postac mag = new Mag();
        Postac wojownik = new Wojownik();

        mag.walcz();
        wojownik.walcz();

        System.out.println(mag.iloscPz());
        System.out.println(wojownik.iloscPz());

        ZywyObiekt zywyObiekt = new Mag();

        zywyObiekt.umrzyj();

    }
}
