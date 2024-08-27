package Factory.Creators;
import Factory.Products.midfielder;
import Factory.Products.Player;

class midfielder_fact implements Player_made{
    public Player createPlayer(String name){
        return  new midfielder(name);
    }


}
