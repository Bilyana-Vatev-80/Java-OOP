package CounterStriker.models.players;

import CounterStriker.models.guns.Gun;
import CounterStriker.models.guns.GunImpl;

import static CounterStriker.common.ExceptionMessages.*;

public abstract class PlayerImpl implements Player {
    private String username;
    private int health;
    private int armor;
    private boolean isAlive;
    private Gun gun;

    protected PlayerImpl(String username, int health, int armor, Gun gun){
        this.setUsername(username);
        this.setHealth(health);
        this.setArmor(armor);
        this.setGun(gun);
    }

    public void setUsername(String username) {
        if(username == null || username.trim().isEmpty()){
            throw new NullPointerException(INVALID_PLAYER_NAME);
        }
        this.username = username;
    }

    public void setHealth(int health) {
        if(health < 0){
            throw new IllegalArgumentException(INVALID_PLAYER_HEALTH);
        }
        this.health = health;
    }

    public void setArmor(int armor) {
        if(health < 0){
            throw new IllegalArgumentException(INVALID_PLAYER_ARMOR);
        }
        this.armor = armor;
    }

    public void setGun(Gun gun) {
        if(gun == null){
            throw new NullPointerException(INVALID_GUN);
        }
        this.gun = gun;
    }

    public void setAlive(boolean alive) {
        if(health < 0){
            isAlive= false;
        }
        isAlive = true;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getArmor() {
        return this.armor;
    }

    @Override
    public Gun getGun() {
        return this.gun;
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public void takeDamage(int points) {
           decreaseArmor(points);
    }

    public void decreaseArmor(int points){
        if(this.armor >= points){
            this.armor -= points;
        } else {
            decreaseHealth(points);
        }
    }

    private void decreaseHealth(int points) {
        this.health -= points;
        if(this.health < 0){
            this.isAlive = false;
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()).append(": ").append(username).append(System.lineSeparator())
                .append("--Health").append(health).append(System.lineSeparator())
                .append("--Armor").append(armor).append(System.lineSeparator())
                .append("--Gun").append(gun.getName());

        return sb.toString().trim();
    }
}
