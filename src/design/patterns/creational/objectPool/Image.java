package design.patterns.creational.objectPool;

import java.util.Map;

public interface Image extends poolable{
    void draw();
    Map<Integer, Integer> getLocation();
    void setLocation(Map<Integer,Integer> location);

}
