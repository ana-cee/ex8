package src;

public class DehumidifierOffState extends State {
    CoolingState cooling;

    public DehumidifierOffState(CoolingState cooling) {
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
        return "dehumidifier off";
    }
}
