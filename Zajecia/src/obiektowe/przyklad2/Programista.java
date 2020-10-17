package obiektowe.przyklad2;

public class Programista extends Pracownik {

    private String[] znaneJezyki;

    public Programista(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek, pensja);
    }

    public String[] getZnaneJezyki() {
        return znaneJezyki;
    }

    public void setZnaneJezyki(String[] znaneJezyki) {
        this.znaneJezyki = znaneJezyki;
    }

    @Override
    public void describe() {
        System.out.println("Jestem Programistą nazywam się "
                +getImie()+ " "+getNazwisko()
                +" i mam " +getWiek() + " lat");
    }
}
