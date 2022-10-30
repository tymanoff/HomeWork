package basepatterns.structural.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()) {
            System.out.println("Developer is so job...");
        } else {
            System.out.println("Developer slip...");
        }
    }
}
