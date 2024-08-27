package Factory.Creators;

import Factory.Products.Player;

public interface Player_made{
    public abstract Player createPlayer(String name);
}

