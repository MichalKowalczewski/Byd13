package com.sda.strumienie.zadanie;

public class Address {
    private String street;
    private String buildingNo;
    private String aptNo;
    private String city;

    public Address(String street, String buildingNo, String aptNo, String city) {
        this.street = street;
        this.buildingNo = buildingNo;
        this.aptNo = aptNo;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getAptNo() {
        return aptNo;
    }

    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
