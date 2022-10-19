package basepatterns.structural.facade;

public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveJob() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
        bugTracker.stopSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
