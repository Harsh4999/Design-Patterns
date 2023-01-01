package design.patterns.behavioral.momento;

public class AddStepCommand extends AbstractWorkflowCommand{
    private String step;
    public AddStepCommand(WorkflowDesigner designer,String step) {
        super(designer);
        this.step=step;
    }
    @Override
    public void execute() {
        this.momento= receiver.getMomento();
        receiver.createWorkflow(step);
    }
}
