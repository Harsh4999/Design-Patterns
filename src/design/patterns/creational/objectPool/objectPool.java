package design.patterns.creational.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class objectPool<T extends poolable>{
    private BlockingQueue<T> availablePool;
    public objectPool(Supplier<T> creator, int count){
        availablePool = new LinkedBlockingQueue<>();
        for(int i=0;i<count;i++){
            availablePool.offer(creator.get());
        }
    }
    public T get(){
        try{
           return availablePool.take();
        }catch (InterruptedException e) {
          //  throw new RuntimeException(e);
            System.out.println("take was interrupted");
        }
        return null;
    }
    public void release(T obj){
        obj.reset();
        try{
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.out.println("put interrupted");
        }
    }

}
