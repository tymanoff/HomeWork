package basepatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        DeveloperFactory developerFactory1 = createDeveloperBySpecialty("c++");
        DeveloperFactory developerFactory2 = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();
        Developer developer1 = developerFactory1.createDeveloper();
        Developer developer2 = developerFactory2.createDeveloper();


        developer.writeCode();
        developer1.writeCode();
        developer2.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty.");
        }
    }
}
