package design.patterns.creational.simpleFactory;
//This class acts as a simple factory for creation of different posts on website.
public class PostFactory {
    public static Post createPost(String type){
        //based on type we decide what to make
        switch(type){
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw new RuntimeException("Invalid calss");
        }
    }
}
