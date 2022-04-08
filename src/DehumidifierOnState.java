package src;

public class DehumidifierOnState extends State{
    CoolingState cooling;

    public DehumidifierOnState(CoolingState cooling) {
        super();
        this.cooling = cooling;
    }

    public String toString() {
        return "dehumidifier on";
    }
}
