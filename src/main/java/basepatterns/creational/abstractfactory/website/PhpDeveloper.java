package basepatterns.creational.abstractfactory.website;

import basepatterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP coding website...");
    }
}
