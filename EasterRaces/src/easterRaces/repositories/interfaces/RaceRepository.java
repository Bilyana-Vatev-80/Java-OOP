package easterRaces.repositories.interfaces;

import easterRaces.entities.cars.Car;
import easterRaces.entities.racers.Race;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RaceRepository<T> implements Repository<Race>{
    private Collection<Race> models;

    public RaceRepository() {
        this.models = new ArrayList<>();
    }


    @Override
    public Race getByName(String name) {
        return null;
    }

    @Override
    public Collection<Race> getAll() {
        return null;
    }

    @Override
    public void add(Race model) {

    }

    @Override
    public boolean remove(Race model) {
        return false;
    }
}
