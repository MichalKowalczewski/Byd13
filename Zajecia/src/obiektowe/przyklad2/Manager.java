package obiektowe.przyklad2;

public class Manager extends Pracownik {

    private Pracownik[] podlegliPracownicy;

    public Manager(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek, pensja);
    }

    public Pracownik[] getPodlegliPracownicy() {
        return podlegliPracownicy;
    }

    public void setPodlegliPracownicy(Pracownik[] podlegliPracownicy) {
        this.podlegliPracownicy = podlegliPracownicy;
    }

    @Override
    public void describe() {
        System.out.println("Jestem Managerem, nazywam się: "+getImie()
        +getNazwisko() + " i mam " +getWiek() + " lat");
    }
}
