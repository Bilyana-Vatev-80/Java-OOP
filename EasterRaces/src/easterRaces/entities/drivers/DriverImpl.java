package easterRaces.entities.drivers;

import easterRaces.entities.cars.Car;

import static easterRaces.common.ExceptionMessages.*;

public class DriverImpl implements Driver{
    private String name;
    private Car car;
    private int numberOfWins;
    private boolean canParticipate;

    public DriverImpl(String name) {
        this.setName(name);
        this.car = null;
        this.setNumberOfWins(numberOfWins);
        this.setCanParticipate(canParticipate);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty() || name.length() < 5){
            throw new IllegalArgumentException(String.format(INVALID_NAME,name,5));
        }
        this.name = name;
    }

    @Override
    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public int getNumberOfWins() {
        return this.numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    @Override
    public void addCar(Car car) {
        if(car == null){
            throw new IllegalArgumentException(CAR_INVALID);
        }
        this.car = car;
        this.canParticipate = true;
    }

    @Override
    public void winRace() {
      this.numberOfWins ++;
    }

    public void setCanParticipate(boolean canParticipate) {
        if(this.car != null){
            this.canParticipate = true;
        }
        this.canParticipate = false;
    }

    @Override
    public boolean getCanParticipate() {
        return canParticipate;
    }
}
