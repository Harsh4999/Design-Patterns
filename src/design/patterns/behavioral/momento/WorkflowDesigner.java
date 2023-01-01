package design.patterns.behavioral.momento;
//Receiver
public class WorkflowDesigner {
    private Workflow workflow;
    public void createWorkflow(String name){
        workflow=new Workflow(name);
    }
    public Workflow getWorkflow(){
        return this.workflow;
    }
    public Momento getMomento(){
        if(workflow==null){
            return new Momento();
        }
        return new Momento(workflow.getSteps(),workflow.getName());
    }
    public void setMomento(Momento momento){
        if(workflow.getSteps()==null && workflow.getName()==null) {
            this.workflow = null;
        }else{
            this.workflow=new Workflow(momento.getName(), momento.getSteps());

        }
    }
    public void addStep(String step){
        workflow.addStep(step);
    }
    public void removeStep(String step){
        workflow.removeStep(step);
    }
    public void print(){
        System.out.println(workflow);
    }
    public class Momento{
        private String[] steps;
        private String name;
        private Momento(String[] steps,String name){
            this.steps=steps;
            this.name = name;
        }
        private Momento(){

        }
        private String[] getSteps(){
            return steps;
        }

        private String getName(){
            return name;
        }
    }
}
