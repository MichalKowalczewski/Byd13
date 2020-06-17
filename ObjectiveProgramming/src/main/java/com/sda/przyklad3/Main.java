package com.sda.przyklad3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Paszport paszport = new Paszport("85010511111", date, new Osoba("Jan", "Kowalski"));
    }
}
