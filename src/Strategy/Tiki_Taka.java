package Strategy;

public class Tiki_Taka implements Current_Tactic {
    @Override
    public void tactic(String name) {
        // Implement Bubble Sort algorithm
        System.out.println("New Tactic of " + name);
        System.out.println("===================================================================");
        System.out.println("Formation: 4-3-3");
        System.out.println("Style: Slow Organised style of football with no rush.");
        System.out.println("===================================================================");
    }
}
