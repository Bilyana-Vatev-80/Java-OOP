package animal;

public class Kitten extends Cat{
    public Kitten(String name,int age){
        super(name,age,Gender.FEMALE);
    }

    @Override
    protected String produceSound() {
        return "Meow";
    }
}
