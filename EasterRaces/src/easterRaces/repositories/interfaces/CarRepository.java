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
        for (Car car: models) {
            if(car.getModel().equals(name)){
                return car;
            }
        }
        return null;
    }

    @Override
    public Collection<Car> getAll() {
        return this.models;
    }

    @Override
    public void add(Car model) {
       this.models.add(model);
    }

    @Override
    public boolean remove(Car model) {
        return this.models.remove(model);
    }
}
