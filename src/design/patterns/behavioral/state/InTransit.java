package design.patterns.behavioral.state;
//Concrete state
public class InTransit implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for cancellation");
        System.out.println("Contacting payment gateway for tansaction roll back");
        return 20;
    }

    @Override
    public OrderState next() {
        return new Delivered();
    }

}
