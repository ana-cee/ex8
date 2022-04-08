package src;

public class DehumidifierOffState extends State {
    CoolingState cooling;

    public DehumidifierOffState(CoolingState cooling) {
        super();
        this.cooling = cooling;
    }

    public String toString() {
        return "dehumidifier is off";
    }
}
