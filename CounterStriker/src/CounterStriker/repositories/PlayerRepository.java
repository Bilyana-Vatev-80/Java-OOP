package CounterStriker.repositories;

import CounterStriker.models.players.Player;

import java.util.ArrayList;
import java.util.Collection;

import static CounterStriker.common.ExceptionMessages.INVALID_PLAYER_REPOSITORY;

public class PlayerRepository implements Repository<Player>{
    private Collection<Player> models;

    public PlayerRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public Collection<Player> getModels() {
        return this.models;
    }

    @Override
    public void add(Player player) {
        if(player == null){
            throw new NullPointerException(INVALID_PLAYER_REPOSITORY);
        }
        this.models.add(player);
    }

    @Override
    public boolean remove(Player player) {
        return this.models.remove(player);
    }

    @Override
    public Player findByName(String player) {
        return models.stream().filter(p -> p.getUsername().equals(player))
                .findFirst().orElse(null);
    }
}
