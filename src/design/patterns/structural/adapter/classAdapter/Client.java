package design.patterns.structural.adapter.classAdapter;

public class Client {
    public static String designCard(Customer customer){
        String card = " ";
        card += customer.getName();
        card += "\n"+  customer.getDestination();
        card +="\n"+ customer.getAddress();
        return card;
    }

    public static void main(String[] args) {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        //Input
        adapter.setFullName("Harsh");
        adapter.setJobTitle("SWE-1");
        adapter.setLocation("India");
        //output
        String card = designCard(adapter);
        System.out.println(card);

    }
}
