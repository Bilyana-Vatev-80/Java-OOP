package CounterStriker.repositories;

import CounterStriker.models.guns.Gun;

import java.util.ArrayList;
import java.util.Collection;

import static CounterStriker.common.ExceptionMessages.*;

public class GunRepository implements Repository<Gun>{
    private Collection<Gun>models;

    public GunRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public Collection<Gun> getModels() {
        return this.models;
    }

    @Override
    public void add(Gun gun) {
       if(gun == null){
           throw new NullPointerException(INVALID_GUN_REPOSITORY);
       }
       this.models.add(gun);
    }

    @Override
    public boolean remove(Gun gun) {
        return this.models.remove(gun);
    }

    @Override
    public Gun findByName(String gun) {
        return this.models.stream().filter(gun1 -> gun1.getName().equals(gun))
                .findFirst().orElse(null);
    }
}
