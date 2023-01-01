package design.patterns.behavioral.strategy;

import java.util.Collection;
import java.util.Iterator;
//Concrete Strategy
public class SummaryPrinter implements OrderPrinter{
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("Printing started");
        Iterator<Order> itr = orders.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Printing ended");
    }
}
