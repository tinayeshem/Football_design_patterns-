package Command;
import Command.command;
import Factory.Products.Player;


public class Make_run implements command{

    private Player player;

    public Make_run(Player player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.start_run();
    }

    @Override
    public void stop(){
        player.stop_run();
    }
}
