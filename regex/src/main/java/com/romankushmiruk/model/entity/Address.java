package com.romankushmiruk.model.entity;


public class Address {
    private String index;
    private String city;
    private String street;
    private String building;
    private String flat;
    private String fullAddress;

    public Address(String index, String city, String street, String building, String flat) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.building = building;
        this.flat = flat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (!index.equals(address.index)) return false;
        if (!city.equals(address.city)) return false;
        if (!street.equals(address.street)) return false;
        if (!building.equals(address.building)) return false;
        if (!flat.equals(address.flat)) return false;
        return fullAddress != null ? fullAddress.equals(address.fullAddress) : address.fullAddress == null;
    }

    @Override
    public int hashCode() {
        int result = index.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + building.hashCode();
        result = 31 * result + flat.hashCode();
        result = 31 * result + (fullAddress != null ? fullAddress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "index='" + index + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", flat=" + flat +
                '}';
    }
}
