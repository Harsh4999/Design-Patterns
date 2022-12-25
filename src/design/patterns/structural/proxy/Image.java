package design.patterns.structural.proxy;

import java.util.Map;

/*
* Subject interface
* */
public interface Image {
    void setLocation(Map<Integer,Integer> location);
    Map<Integer,Integer> getLocation();
    void render();
}
