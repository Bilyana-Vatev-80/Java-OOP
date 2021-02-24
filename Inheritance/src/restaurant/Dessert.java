package restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{
    private double calories;

    public Dessert (String name, BigDecimal price, double grams,double c){
        super(name,price,grams);
        this.calories = calories;
    }

    public double getCalories() {
        return this.calories;
    }
}
