package Factory.Creators;
import Factory.Products.*;

class striker_fact implements Player_made{
    @Override
    public Player createPlayer(String name){
        return  new striker(name);
    }
}

