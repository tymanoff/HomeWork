package basepatterns.structural.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Start sprint.");
        activeSprint = true;
    }

    public void stopSprint(){
        System.out.println("Stop sprint");
        activeSprint = false;
    }
}
