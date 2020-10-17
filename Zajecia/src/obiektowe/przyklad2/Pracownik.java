package obiektowe.przyklad2;

public class Pracownik extends Osoba {

    private int pensja;

    public Pracownik(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek);
        this.pensja = pensja;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    @Override
    public void describe() {
        System.out.println("Jestem Pracownikiem nazywam się "
                +getImie()+ " "+getNazwisko()
                +" i mam " +getWiek() + " lat");
    }
}
