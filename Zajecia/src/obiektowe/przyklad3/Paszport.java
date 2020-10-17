package obiektowe.przyklad3;

import java.time.LocalDate;

public class Paszport {
    private final String numerPesel;
    private final LocalDate dataWydania;
    private final Osoba wlascicielPaszportu;

    public Paszport(String numerPesel, LocalDate dataWydania, Osoba wlascicielPaszportu) {
        this.numerPesel = numerPesel;
        this.dataWydania = dataWydania;
        this.wlascicielPaszportu = wlascicielPaszportu;
    }

    public String getNumerPesel() {
        return numerPesel;
    }

    public LocalDate getDataWydania() {
        return dataWydania;
    }

    public Osoba getWlascicielPaszportu() {
        return wlascicielPaszportu;
    }
}
