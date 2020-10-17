package obiektowe.przyklad2;

public class ProgramistaSenior extends Programista {

    private int bonusSeniora;

    public ProgramistaSenior(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek, pensja);
    }

    public int getBonusSeniora() {
        return bonusSeniora;
    }

    public void setBonusSeniora(int bonusSeniora) {
        this.bonusSeniora = bonusSeniora;
    }

    public void describe() {
        System.out.println("Jestem Programistą Seniorem nazywam się "
                +getImie()+ " "+getNazwisko()
                +" i mam " +getWiek() + " lat");
    }
}
