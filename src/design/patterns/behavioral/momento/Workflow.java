package design.patterns.behavioral.momento;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
//Originator
public class Workflow {
    private LinkedList<String> steps;
    private String name;
    public Workflow(String name) {
        this.name = name;
        this.steps = new LinkedList<>();
    }
    public Workflow(String name, String... steps){
        this.name = name;
        this.steps = new LinkedList<>();
        if(steps!=null&& steps.length>0){
            Arrays.stream(steps).forEach(s->this.steps.add(s));
        }
    }
    public void addStep(String step){
        this.steps.add(step);
    }
    public void removeStep(String step){
        this.steps.remove(step);
    }
    @Override
    public String toString() {
        return "Workflow{" +
                "steps=" + steps +
                ", name='" + name + '\'' +
                '}';
    }

    public String[] getSteps() {
        Object[] o = steps.toArray();
        return Arrays.copyOf(o,o.length,String[].class);
    }

    public void setSteps(LinkedList<String> steps) {
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
