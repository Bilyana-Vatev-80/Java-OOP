package easterRaces.entities.drivers;

import easterRaces.entities.cars.Car;

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

    }

    @Override
    public void winRace() {

    }

    public void setCanParticipate(boolean canParticipate) {
        this.canParticipate = canParticipate;
    }

    @Override
    public boolean getCanParticipate() {
        return canParticipate;
    }
}
