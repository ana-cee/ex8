package src;

public class HumidifierOffState extends State{
    HeatingState heating;

    public HumidifierOffState(HeatingState heating) {
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
        return "humidifier is off";
    }
}
