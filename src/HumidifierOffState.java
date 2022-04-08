package src;

public class HumidifierOffState extends State{
    HeatingState heating;

    public HumidifierOffState(HeatingState heating) {
        super();
        this.heating = heating;
    }

    public String toString() {
        return "humidifier is off";
    }
}
