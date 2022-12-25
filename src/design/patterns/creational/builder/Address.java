package design.patterns.creational.builder;
//part of final class
public class Address {
    private String houseNumber;
    private String city;
    private String street;
    private String zipcode;
    private String state;

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
