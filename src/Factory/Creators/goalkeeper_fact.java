package Factory.Creators;
import Factory.Products.goalkeeper;
import Factory.Products.Player;

public class goalkeeper_fact implements Player_made{



    @Override
    public Player createPlayer(String name){
        return  new goalkeeper(name);
    }
}
