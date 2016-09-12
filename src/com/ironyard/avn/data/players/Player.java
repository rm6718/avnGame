package com.ironyard.avn.data.players;

/**
 * Created by reeva on 9/12/16.
 */
public abstract class Player {
    private int health;
    private String username;

    public String toString(){
        return getType();
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public abstract String getType();



}
