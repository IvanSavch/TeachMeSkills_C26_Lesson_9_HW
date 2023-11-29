package com.teachmeskills.lesson9.HW.task1.task3.client;

import java.util.Date;
public class Address {
    private int postcode;
    private String country;
    private String city;
    private String street;
    private int houseNumber;

    public Address(int postcode, String country, String city, String street, int houseNumber) {
        this.postcode = postcode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
