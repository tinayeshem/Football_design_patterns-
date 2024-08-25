package Command;

public class Coach {

    private command command;

    public void setCommand(command command) {
        this.command = command;
    }

    public void tellPlayer() {
        command.execute();
    }
}



