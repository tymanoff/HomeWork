package basepatterns.creational.abstractfactory;

import basepatterns.creational.abstractfactory.banking.BankTeamFactory;

public class BankTeam {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankTeamFactory();
        Developer developer = projectTeamFactory.getFirstDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Create bank....");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
