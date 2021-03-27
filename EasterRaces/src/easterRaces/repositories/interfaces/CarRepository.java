package easterRaces.repositories.interfaces;

import easterRaces.entities.cars.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarRepository<T> implements Repository<Car>{
    private Collection<Car> models;

    public CarRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public Car getByName(String name) {
        return null;
    }

    @Override
    public Collection<Car> getAll() {
        return null;
    }

    @Override
    public void add(Car model) {

    }

    @Override
    public boolean remove(Car model) {
        return false;
    }
}
