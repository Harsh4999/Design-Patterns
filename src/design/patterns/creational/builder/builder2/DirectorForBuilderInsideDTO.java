package design.patterns.creational.builder.builder2;

import design.patterns.creational.builder.Address;
import design.patterns.creational.builder.User;

import java.time.LocalDate;

public class DirectorForBuilderInsideDTO {
    public static void main(String[] args) {
        User w = createFakeUser();
        UserWebDTOWithBuilder u = directBuild(UserWebDTOWithBuilder.getBuilder(),w);
        System.out.println(u.getName());
        System.out.println(u.getAddress());
        System.out.println(u.getAge());
    }

    private static UserWebDTOWithBuilder directBuild(UserWebDTOWithBuilder.UserDTOBuilder builder, User u){
        return builder.withFirstname(u.getFirstname())
                .withLastname(u.getLastname())
                .withAddress(u.getAddress())
                .withBirthDay(u.getBirthday())
                .build();
    }
    public static User createFakeUser(){
        User u = new User();
        u.setFirstname("Harsh");
        u.setLastname("Trivedi");
        u.setBirthday(LocalDate.of(2001,11,9));
        Address a = new Address();
        a.setCity("Rajkot");
        a.setState("Gujarat");
        a.setHouseNumber("13-b");
        a.setStreet("Downing street");
        a.setZipcode("360001");
        u.setAddress(a);
        return u;
    }
}
