package basepatterns.structural.decorator;

public class JavaTeamDeveloper extends DeveloperDecorator{
    public JavaTeamDeveloper(Developer developer) {
        super(developer);
    }

    public String makeSeeCode() {
        return " See code.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeSeeCode();
    }
}
