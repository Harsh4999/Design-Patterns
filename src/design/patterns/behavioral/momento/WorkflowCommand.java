package design.patterns.behavioral.momento;

public interface WorkflowCommand {
    void execute();
    void undo();
}
