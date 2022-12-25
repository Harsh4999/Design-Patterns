package design.patterns.structural.bridge;
/*
* Its the abstraction
* */
public interface FifoCollection<T> {
    void offer(T element);
    T pull();
}
