package ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public
    Person (String firstName, String secondName, int age, double salary) {
        this.setFirstName (firstName);
        this.setLastName (secondName);
        this.setAge (age);
        this.setSalary (salary);
    }
    public void validateName(String name,String prefix){
        if(name.length() < 3) {
            throw new IllegalArgumentException(prefix + " cannot be less than 3 symbols");
        }
    }

    public void setLastName(String secondName) {
        validateName(secondName,"Last name");
        this.lastName = secondName;
    }

    public void setFirstName(String firstName) {
        validateName(firstName,"First name");
        this.firstName = firstName;
    }
    public void setSecondName(String secondName){
        this.lastName = secondName;
    }

    public void setAge(int age) {
        if(age <= 0){
            throw new IllegalArgumentException ("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary < 460){
            throw new IllegalArgumentException ("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public
    void increaseSalary (double bonus) {
        if (this.getAge () < 30) {
            this.setSalary (this.getSalary () * (1 + bonus / 200));
        } else {
            this.setSalary(this.getSalary() * (1 + bonus / 100));
        }
    }

    @Override
    public
    String toString () {
            return String.format("%s %s gets %s leva", this.getFirstName(), this.getLastName(), this.getSalary());

    }
}
