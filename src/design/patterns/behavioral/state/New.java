package design.patterns.behavioral.state;
//Concrete state
public class New  implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("It's a new Order, No proccessing needed");
        return 0;
    }

    @Override
    public OrderState next() {
        return null;
    }
}