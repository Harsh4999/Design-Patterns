package design.patterns.structural.bridge;
/*
* Its Implementor
* It has its own hierarchy
* */
public interface LinkedList<T> {
    void addFirst(T element);
    T removeFirst();
    void addLast(T element);
    T removeLast();
    int getSize();
}
