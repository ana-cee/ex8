package src;

public class HumidifierOnState extends State{
    HeatingState heating;

    public HumidifierOnState(HeatingState heating) {
        super();
        this.heating = heating;
    }

    public String toString() {
        return "humidifier is on";
    }
}
