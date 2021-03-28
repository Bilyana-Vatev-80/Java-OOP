package easterRaces.entities.cars;

import static easterRaces.common.ExceptionMessages.*;

public abstract class BaseCar implements Car{
    private String model;
    private int horsePower;
    private double cubicCentimeters;

    public BaseCar(String model, int horsePower, double cubicCentimeters) {
        this.setModel(model);
        this.setHorsePower(horsePower);
        this.setCubicCentimeters(cubicCentimeters);
    }

    public void setModel(String model) {
        if(model == null || model.trim().isEmpty() || model.length() < 4){
            throw new IllegalArgumentException(String.format(INVALID_MODEL,model,4));
        }
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setHorsePower(int horsePower) {
        switch (this.getClass().getSimpleName()){
            case "MuscleCar":
                if(horsePower < 400 || horsePower > 600){
                    throw new IllegalArgumentException(String.format(INVALID_HORSE_POWER, horsePower));
                }
               break;
            case "SportCar":
                if(horsePower < 250 || horsePower > 450){
                    throw new IllegalArgumentException(String.format(INVALID_HORSE_POWER, horsePower));
                }
                break;
        }
        this.horsePower = horsePower;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    public void setCubicCentimeters(double cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }

    @Override
    public double getCubicCentimeters() {
        return cubicCentimeters;
    }

    @Override
    public double calculateRacePoints(int laps) {
        return cubicCentimeters / (horsePower * laps);
    }
}
