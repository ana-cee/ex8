package src;

public class HeatingState extends State{
    OperatingState ac;

    State humidifierOnState;
    State humidifierOffState;
    State currentState;

    public HeatingState(OperatingState ac) {
        super();
        this.ac = ac;
        humidifierOnState = new HumidifierOnState(this);
        humidifierOffState = new HumidifierOffState(this);
        currentState = humidifierOffState;
    }

    public void setState(State state) {
        currentState = state;
    }

    @Override
    public void increaseTempButtonPressed() {

        if (ac.getPower() == 0) {
            System.out.println(ac.getName() + ": no increase of temp since system is off");
        } else {
            if (ac.getTemp() >= 22) {
                setState(humidifierOnState);
            } else if (ac.getTemp() <= 21) {
                setState(humidifierOffState);
            }
            System.out.println("heating: new temp is " + ac.getTemp() + " and " + currentState.toString());
        }
    }

    @Override
    public void decreaseTempButtonPressed() {
        if (ac.getTemp() >= 22) {
            setState(humidifierOnState);
        } else if (ac.getTemp() <= 21) {
            setState(humidifierOffState);
        }
        System.out.println("heating: new temp is " + ac.getTemp() + " and " + currentState.toString());
    }

    @Override
    public void powerButtonPressed() {
/*        if (ac.getTemp() <= 21) {
            setState(humidifierOffState);
        } else if (ac.getTemp() >= 22) {
            setState(humidifierOnState);
        }*/
    }

    public String toString() {
        return "on heating at " + ac.getTemp() + " degree and " + currentState.toString();
    }
}
