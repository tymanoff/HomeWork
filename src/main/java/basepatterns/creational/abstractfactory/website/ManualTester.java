package basepatterns.creational.abstractfactory.website;

import basepatterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual testing website...");
    }
}
