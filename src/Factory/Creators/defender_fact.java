package Factory.Creators;
import Factory.Products.Player;
import  Factory.Products.defender;

class defender_fact implements Player_made{
    public Player createPlayer(String name){
        return new defender(name);
    }
}
