package design.patterns.behavioral.state;
//Concrete state
public class Cancelled implements OrderState{
    @Override
    public double handleCancellation() {
       throw new IllegalStateException("Already cancelled order");
    }

    @Override
    public OrderState next() {
        return null;
    }
}
