package basepatterns.creational.abstractfactory;

import basepatterns.creational.abstractfactory.website.WebsiteTeamFactory;

public class WebsiteTeam {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getFirstDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating work website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
