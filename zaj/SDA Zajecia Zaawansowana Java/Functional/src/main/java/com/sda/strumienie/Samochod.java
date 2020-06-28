package com.sda.strumienie;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Samochod {
    private String nazwa;
    private double mocKM;
    private double cena;
    private double przebieg;
}
