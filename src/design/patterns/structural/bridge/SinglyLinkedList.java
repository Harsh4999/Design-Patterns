package design.patterns.structural.bridge;

public class SinglyLinkedList<T> implements LinkedList<T> {
    private class Node{
        private Object data;
        private Node next;
        private Node(Object data,Node next){
            this.data= data;
            this.next = next;
        }
    }

    private int size;
    private Node head;
    private Node tail;

    @Override
    public void addFirst(T element) {
        if(head==null){
            tail = head= new Node(element,null);
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if(head==null){
            return null;
        }
        T temp = (T) head.data;
        if(head.next !=null){
            head = head.next;
        }else{
            head = null;
            tail = null;
        }
        size--;
        return temp;
    }


    @Override
    public void addLast(T element) {
        if(head == null){
            head = tail = new Node(element,null);
            return;
        }else{
            Node temp =new Node(element,null);
            tail.next= temp;
            tail = tail.next;
        }
    }

    @Override
    public T removeLast() {
        if(head ==null){
            return null;
        }
        T temp = (T)tail.data;
        Node temp1 = head;
        while(temp1.next.data!=temp){
            temp1=temp1.next;
        }
        temp1.next = null;
        tail = temp1;
        return temp;
    }

    @Override
    public int getSize() {
        int size=0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
}
