package basepatterns.creational.abstractfactory.website;

import basepatterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages website...");
    }
}
