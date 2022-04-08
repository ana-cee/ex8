package src;

public class HumidifierOnState extends State{
    HeatingState heating;

    public HumidifierOnState(HeatingState heating) {
        super();
        this.heating = heating;
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
        return "humidifier is on";
    }
}
