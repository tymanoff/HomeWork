package basepatterns.creational.abstractfactory.banking;

import basepatterns.creational.abstractfactory.ProjectManager;

public class BankPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages bank...");
    }
}
