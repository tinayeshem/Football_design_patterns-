package Observer;

public class Team_Group implements observer{
    String event;

    @Override
    public void update(String weather) {
        this.event = weather;
        display();
    }

    private void display() {
        System.out.println("Upcoming Event: " );
        System.out.println("=============================================================" );
        System.out.println("event");
        System.out.println("=============================================================" );

    }

}
