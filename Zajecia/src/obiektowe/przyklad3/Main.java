package obiektowe.przyklad3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Paszport paszport = new Paszport("48454616874",
                LocalDate.now(),
                new Osoba("Jan", "Kowalski"));
        System.out.println(paszport.toString());
    }
}
