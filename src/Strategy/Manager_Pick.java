package Strategy;

public class Manager_Pick {

    private  Current_Tactic manager_Choice;

    public Manager_Pick(Current_Tactic manager_Choice) {
        this.manager_Choice = manager_Choice;
    }

    public void setTactic(Current_Tactic manager_Choice) {
        this.manager_Choice = manager_Choice;
    }

    public void performSort() {
        manager_Choice.tactic();
    }

}

