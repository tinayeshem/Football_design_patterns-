package Command;

import Factory.Products.Player;

public class Call_for_ball implements command{
    private Factory.Products.Player player;

    public Call_for_ball(Player player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.call_for_ball();

    }

    @Override
    public void stop(){
        player.stop_calling();
    }
}
