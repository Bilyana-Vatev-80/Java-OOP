package easterRaces.repositories.interfaces;

import easterRaces.entities.cars.Car;
import easterRaces.entities.drivers.Driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DriverRepository<T> implements Repository<Driver>{
    private Collection<Driver> models;

    public DriverRepository() {
        this.models = new ArrayList<>();
    }


    @Override
    public Driver getByName(String name) {
        for (Driver drive : models) {
            if(drive.getName().equals(name)){
                return drive;
            }
        }
        return null;
    }

    @Override
    public Collection<Driver> getAll() {
        return this.models;
    }

    @Override
    public void add(Driver model) {
       this.models.add(model);
    }

    @Override
    public boolean remove(Driver model) {
        return this.models.remove(model);
    }
}
