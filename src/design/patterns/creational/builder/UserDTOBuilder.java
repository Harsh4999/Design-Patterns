package design.patterns.creational.builder;

import java.time.LocalDate;

//Abstract builder
public interface UserDTOBuilder {
    //Allowing method chaining
    UserDTOBuilder withFirstname(String firstname);
    UserDTOBuilder withLastname(String lastname);
    UserDTOBuilder withBirthDay(LocalDate birthDay);
    UserDTOBuilder withAddress(Address address);
    UserDTO build();
    UserDTO getUserDTO();
}
