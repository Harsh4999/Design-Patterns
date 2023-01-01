package design.patterns.behavioral.observers;

import java.util.ArrayList;
import java.util.List;

//Observable
public class Order {
    private String id;
    private double itemCost;
    private double shippingCost;
    private int count;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private double discount;
    private List<OrderObserver> observers = new ArrayList<>();
    public Order(String id){
        this.id = id;
    }
    public void attach(OrderObserver observer){
        observers.add(observer);
    }
    public void detach(OrderObserver observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        observers.forEach(o->o.updated(this));
    }
    public double getTotal(){
        return itemCost-discount+shippingCost;
    }
    public void addItem(double price){
        itemCost+=price;
        count++;
        notifyObservers();
    }
    public int getCount(){
        return count;
    }
    public double getItemCost(){
        return itemCost;
    }

    public void setShippingCost(double i) {
        this.shippingCost=i;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", itemCost=" + itemCost +
                ", shippingCost=" + shippingCost +
                ", count=" + count +
                ", discount=" + discount +
                ", observers=" + observers +
                '}';
    }
}
