package obiektowe.przyklad4;

public class Mag implements Postac {

    public void uzyjMagii() {
        System.out.println("Zadałem 8 obrazen");
    }

    @Override
    public void walcz() {
        uzyjMagii();
    }

    @Override
    public void umrzyj() {
        System.out.println("Mag Umiera");
    }
}
