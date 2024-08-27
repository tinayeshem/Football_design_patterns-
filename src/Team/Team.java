package Team;
import java.util.LinkedList;

import Factory.Products.Player;
import Singleton.League_manager;

import java.security.PublicKey;

public class Team {

    private String name;

    private League_manager Coach_name;

    LinkedList<Player> Players = new LinkedList<Player>();


    public Team(String name){
        this.name = name;
    }

    public void setCoach_name(String Coach_name) {
        this.Coach_name = new League_manager(name,Coach_name);
    }

    public League_manager getCoach_name() {
        return Coach_name;
    }

    public String getName() {
        return this.name;
    }


    public   void addPlayer( Player new_Player){
        Players.add(new_Player);

    }

}
