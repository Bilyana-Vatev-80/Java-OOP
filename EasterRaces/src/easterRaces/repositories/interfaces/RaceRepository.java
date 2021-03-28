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
        for (Race race : models) {
            if(race.getName().equals(name)){
                return race;
            }
        }
        return null;
    }

    @Override
    public Collection<Race> getAll() {
        return this.models;
    }

    @Override
    public void add(Race model) {
       models.add(model);
    }

    @Override
    public boolean remove(Race model) {
        return this.models.remove(model);
    }
}
