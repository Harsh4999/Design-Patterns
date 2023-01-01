package design.patterns.behavioral.state;

public class Paid implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment gateway to rollback transaction");
        return 10;
    }

    @Override
    public OrderState next() {
        return null;
    }
}
