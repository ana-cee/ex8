package src;

public class CoolingState extends State{
    OperatingState ac;
    State dehumidifierOnState;
    State dehumidifierOffState;
    State currentState;

    public CoolingState(OperatingState ac) {
        super();
        this.ac = ac;
        dehumidifierOnState = new DehumidifierOnState(this);
        dehumidifierOffState = new DehumidifierOffState(this);
        setState(dehumidifierOffState);
    }

    public void setState(State state) {
        currentState = state;
    }

    public void updateState() {

    }

    @Override
    public void increaseTempButtonPressed() {
        if (ac.getPower() == 0) {
            System.out.println(ac.getName() + ": no decrease of temp since system is off");
        } else {
            if (ac.getTemp() >= 23) {
                setState(dehumidifierOnState);
            } else if (ac.getTemp() <= 22) {
                setState(dehumidifierOffState);
            }
            System.out.println("cooling: new temp is " + ac.getTemp() + " and " + currentState.toString());
        }
    }

    @Override
    public void decreaseTempButtonPressed() {
        if (ac.getTemp() >= 23) {
            setState(dehumidifierOnState);
        } else if (ac.getTemp() <= 22) {
            setState(dehumidifierOffState);
        }
        System.out.println("cooling: new temp is " + ac.getTemp() + " and " + currentState.toString());
    }

    @Override
    public void powerButtonPressed() {
         if (ac.getTemp() <= 22) {
             setState(dehumidifierOffState);
         } else if (ac.getTemp() >= 23) {
             setState(dehumidifierOnState);
         }
    }

    public String toString() {
        return currentState.toString();
    }
}
