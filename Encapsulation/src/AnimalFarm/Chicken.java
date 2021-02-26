package AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
