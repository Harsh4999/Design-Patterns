package design.patterns.structural.bridge;
/*
* Refined abstraction - Concrete abstraction
* */
public class Queue<T> implements FifoCollection<T>{

    private LinkedList<T> list;

    public Queue(LinkedList<T> list){
        this.list=list;
    }
    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T pull() {
        return list.removeFirst();
    }
}
