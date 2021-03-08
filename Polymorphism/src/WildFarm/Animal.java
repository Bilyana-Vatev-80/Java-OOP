package WildFarm;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private String livingRegion;
    private Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight,String livingRegion) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.livingRegion = livingRegion;
        foodEaten = 0;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public Double getAnimalWeight() {
        return this.animalWeight;
    }

    public Integer getFoodEaten() {
        return this.foodEaten;
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    protected abstract void makeSound();

    protected void eat(Food food){
      this.foodEaten += food.getQuantity();
    }
    protected DecimalFormat format(){
        return new DecimalFormat("##.##");
    }
    @Override
    public String toString(){
        return String.format("%s[%s, %s, %s, %d]",getClass().getSimpleName(),getAnimalName(),format().format(getAnimalWeight()),getLivingRegion(),getFoodEaten());
    }
}
