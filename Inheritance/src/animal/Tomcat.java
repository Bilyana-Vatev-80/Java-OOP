package animal;

public class Tomcat extends Cat{
    public Tomcat(String name, int age){
        super(name,age,Gender.FEMALE);
    }

    @Override
    protected String produceSound() {
        return "MEOW";
    }
}
