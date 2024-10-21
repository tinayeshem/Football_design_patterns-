package Factory.Creators;
import Factory.Products.midfielder;
import Factory.Products.Player;

public class midfielder_fact implements Player_made{

    @Override
    public Player createPlayer(String name){
        return  new midfielder(name);
    }


}
