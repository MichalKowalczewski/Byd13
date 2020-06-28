package com.sda.strumieniezadanie;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String street;
    private String buildingNo;
    private String aptNo;
    private String city;
}
