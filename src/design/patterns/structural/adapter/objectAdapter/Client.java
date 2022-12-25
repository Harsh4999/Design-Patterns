package design.patterns.structural.adapter.objectAdapter;

import design.patterns.structural.adapter.objectAdapter.Customer;

public class Client {
    public static String designCard(Customer customer){
        String card = " ";
        card += customer.getName();
        card += "\n"+  customer.getDestination();
        card +="\n"+ customer.getAddress();
        return card;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setFullName("Harsh");
        e.setJobTitle("SWE");
        e.setLocation("India");
        EmployeeClassAdapter adapter = new EmployeeClassAdapter(e);
        String card = designCard(adapter);
        System.out.println(card);
    }
}
