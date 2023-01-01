package design.patterns.behavioral.state;

public class Delivered implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for item pickup");
        System.out.println("Payment rollback will be initiated upon item return");
        return 30;
    }

    @Override
    public OrderState next() {
        return null;
    }
}
