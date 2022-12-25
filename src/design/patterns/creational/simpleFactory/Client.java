package design.patterns.creational.simpleFactory;

public class Client {
    public static void main(String[] args) {
        Post post = PostFactory.createPost("product");
        System.out.println(post);
    }
}
