package design.patterns.behavioral.momento;

public class AbstractWorkflowCommand implements WorkflowCommand{
    protected  WorkflowDesigner.Momento momento;
    protected  WorkflowDesigner receiver;
    public AbstractWorkflowCommand(WorkflowDesigner designer){
        this.receiver=designer;
    }


    @Override
    public void execute() {

    }

    @Override
    public void undo() {
    receiver.setMomento(momento);
    }
}
