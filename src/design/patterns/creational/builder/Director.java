package design.patterns.creational.builder;

import java.time.LocalDate;

//Director which will use builder + user object to get final user object
public class Director {
    public static void main(String[] args) {
        User u = createFakeUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO w = directBuild(builder,u);
        System.out.println(w.getName());
        System.out.println(w.getAddress());
        System.out.println(w.getAge());


    }
    public static UserDTO directBuild(UserDTOBuilder builder,User user){
        return builder.withFirstname(user.getFirstname())
                .withLastname(user.getLastname())
                .withAddress(user.getAddress())
                .withBirthDay(user.getBirthday())
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
