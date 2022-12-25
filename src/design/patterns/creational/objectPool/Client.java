package design.patterns.creational.objectPool;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static final objectPool<Bitmap> bitmapPool = new objectPool<>(()->new Bitmap("logo.png"),5);
    public static void main(String[] args) {
        Bitmap b1 = bitmapPool.get();
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        m.put(1,2);
        b1.setLocation(m);

        Bitmap b2 = bitmapPool.get();
        HashMap<Integer,Integer> m1 = new HashMap<>();
        m1.put(0,3);
        m1.put(1,4);
        b2.setLocation(m1);

        b1.draw();
        b2.draw();

//        bitmapPool.release(b1);
//        bitmapPool.release(b2);

        Bitmap b3 = bitmapPool.get();
        Bitmap b4 = bitmapPool.get();
        Bitmap b5 = bitmapPool.get();
        b5.setLocation(m1);
        b5.draw();
    }
}
