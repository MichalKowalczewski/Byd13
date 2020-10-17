package obiektowe.przyklad4;

public class Wojownik implements Postac {

    public void uzyjMiecza() {
        System.out.println("zadałem 6 obrażeń");
    }

    @Override
    public void walcz() {
        uzyjMiecza();
    }

    @Override
    public void umrzyj() {
        System.out.println("Wojownik umiera");
    }
}
