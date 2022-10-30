package basepatterns.creational.abstractfactory.banking;

import basepatterns.creational.abstractfactory.Developer;
import basepatterns.creational.abstractfactory.ProjectManager;
import basepatterns.creational.abstractfactory.ProjectTeamFactory;
import basepatterns.creational.abstractfactory.Tester;

public class BankTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getFirstDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankPM();
    }
}
