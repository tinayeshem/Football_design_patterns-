package Command;

import Factory.Products.Player;

public interface command {
    void execute();

    void stop();

    void setPlayer(Player player);


}
