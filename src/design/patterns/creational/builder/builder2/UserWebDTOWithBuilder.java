package design.patterns.creational.builder.builder2;

import design.patterns.creational.builder.Address;

import java.time.LocalDate;
import java.time.Period;

//To keep class immutable we define builder inside the DTO class itself as a static member
public class UserWebDTOWithBuilder {
     private String name;
     private String age;
     private String address;


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }
    public static UserDTOBuilder getBuilder(){
        return new UserDTOBuilder();
    }
    public static class UserDTOBuilder{
        private String firstname;
        private String lastname;
        private String age;

        private String address;
        private UserWebDTOWithBuilder dto;

        public UserDTOBuilder withFirstname(String firstname) {
            this.firstname=firstname;
            return this;
        }


        public UserDTOBuilder withLastname(String lastname) {
            this.lastname=lastname;
            return this;
        }


        public UserDTOBuilder withBirthDay(LocalDate birthDay) {
            Period ageInYears = Period.between(birthDay,LocalDate.now());
            this.age = Integer.toString(ageInYears.getYears());
            return this;
        }


        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", "+address.getStreet()+", "+address.getCity()+", "+address.getState()+", "+address.getZipcode();
            return this;
        }


        public UserWebDTOWithBuilder build() {
            this.dto = new UserWebDTOWithBuilder();
            dto.setName(firstname+" "+lastname);
            dto.setAddress(address);
            dto.setAge(age);
            return this.dto;
        }


        public UserWebDTOWithBuilder getUserDTO() {
            return this.dto;
        }
    }
}
