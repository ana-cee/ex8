package src;

public class ACSystem {

    private String name;

    StoppedState stoppedState;
    OperatingState operatingState;

    State currentState;

    public ACSystem(String name) {
        this.name = name;
        stoppedState = new StoppedState(this);
        operatingState = new OperatingState(this);
        currentState = stoppedState;
    }

    public void setState(State state) {
        currentState = state;
    }

    public String getName()
    {
        return name;
    }

    public void changeModeButtonPressed() {
        stoppedState.changeModeButtonPressed();
        operatingState.changeModeButtonPressed();
    }

    public void increaseTempButtonPressed() {
        operatingState.increaseTempButtonPressed();
    }

    public void decreaseTempButtonPressed() {
        operatingState.decreaseTempButtonPressed();
    }

    public void powerButtonPressed() {
        stoppedState.powerButtonPressed();
        operatingState.powerButtonPressed();

        System.out.println(stoppedState.toString() + " " + operatingState.toString());
    }

    public String toString() {
        return "A/C " + getName() + " in " + currentState.toString();
    }
}
