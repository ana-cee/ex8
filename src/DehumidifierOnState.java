package src;

public class DehumidifierOnState extends State{
    CoolingState cooling;

    public DehumidifierOnState(CoolingState cooling) {
        super();
        this.cooling = cooling;
    }
    public void changeModeButtonPressed() {

    }

    public void increaseTempButtonPressed() {

    }

    public void decreaseTempButtonPressed() {

    }

    public void powerButtonPressed() {

    }

    public String toString() {
        return "dehumidifier on";
    }
}
