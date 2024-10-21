package Factory.Creators;
import Factory.Products.Player;
import  Factory.Products.defender;

public class defender_fact implements Player_made{

    @Override
    public Player createPlayer(String name){
        return new defender(name);
    }
}
