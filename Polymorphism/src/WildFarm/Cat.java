package WildFarm;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion,String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    protected void makeSound() {
        System.out.println("Meowwww");
    }
    @Override
    public
    String toString () {

        return String.format ("%s[%s, %s, %s, %s, %d]", getClass ().getSimpleName (), getAnimalName (),
                getBreed (), format ().format (getAnimalWeight ()), getLivingRegion (), getFoodEaten ());
    }
}
