package design.patterns.behavioral.observers;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("100");
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();
        order.attach(priceObserver);
        order.attach(quantityObserver);
        order.addItem(50);
        order.addItem(180);
        order.addItem(200);
        order.addItem(200);
        order.addItem(200);
        order.addItem(200);
        System.out.println(order);
    }
}
