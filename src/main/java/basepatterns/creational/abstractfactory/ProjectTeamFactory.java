package basepatterns.creational.abstractfactory;

public interface ProjectTeamFactory {
    Developer getFirstDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
