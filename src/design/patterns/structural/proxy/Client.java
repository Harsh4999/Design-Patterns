package design.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        //client doesn't know we are not actually creating bitmap image until render is called

        //static proxy
        Image img = ImageFactory.getImage("AI.img");
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,10);
        m.put(1,20);
        img.setLocation(m);
        System.out.println("Image location "+ img.getLocation());
        img.render();


        //Dynamic proxy on runtime
        Image img2 = ImageFactory.getDynamicImage();
        img2.setLocation(m);
        System.out.println("Image location "+ img2.getLocation());
        img2.render();
    }
}
