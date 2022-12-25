package design.patterns.creational.builder;

import java.time.LocalDate;
import java.time.Period;

//Concrete builder
public class UserWebDTOBuilder implements UserDTOBuilder{
    private String firstname;
    private String lastname;
    private String age;

    private String address;
    private UserWebDTO dto;
    @Override
    public UserDTOBuilder withFirstname(String firstname) {
        this.firstname=firstname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastname(String lastname) {
        this.lastname=lastname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDay(LocalDate birthDay) {
        Period ageInYears = Period.between(birthDay,LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", "+address.getStreet()+", "+address.getCity()+", "+address.getState()+", "+address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstname+" "+lastname,address,age);
        return this.dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return this.dto;
    }
}
