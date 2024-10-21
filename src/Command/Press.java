package Command;

import Factory.Products.Player;

public class Press implements command{

    private Player player;

    public Press(Player player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.press();
    }

    @Override
    public void stop(){
        player.stop_press();
    }

    @Override
    public void setPlayer(Player player) {
        this.player = player;
    }
}
