package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name){
        setName(name);
        players = new ArrayList<>();
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty() || name.length() == 0){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void addPlayer(Player player){
        this.players.add(player);
    }
    public void removePlayer(String playerName){
        boolean remove = this.players.removeIf(p -> p.getName().equals(playerName));
        if(!remove){
            throw new IllegalArgumentException("Player" + playerName + "is not in" + name + "team.");
        }
    }
    public double getRating(){
        return this.players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .sum();
    }
}
