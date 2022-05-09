package com.wevibe.app.dtos;

public class Address {
    private Integer idAddress;
    private String nameAddress;
    private String country;
    private String city;
    private String postalCode;
    private String street;
    private Integer streetNumber;
    private Integer apartmentNumber;

    public Address() {
    }

    public Address(Integer idAddress, String nameAddress, String country, String city, String postalCode, String street, Integer streetNumber, Integer apartmentNumber) {
        this.idAddress = idAddress;
        this.nameAddress = nameAddress;
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.streetNumber = streetNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public String getNameAddress() {
        return nameAddress;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    public void setNameAddress(String nameAddress) {
        this.nameAddress = nameAddress;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setApartmentNumber(Integer apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
