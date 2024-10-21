package Command;

import Factory.Products.Player;

public class Get_into_Space implements  command{

    private Player player;

    public Get_into_Space(Player player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.get_into_space();
    }

    @Override
    public void stop(){
        player.stop_in_space();

    }

    @Override
    public void setPlayer(Player player) {
        this.player = player;
    }

}
