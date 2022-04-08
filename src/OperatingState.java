package src;

public class OperatingState extends State{
    ACSystem  ac;
    State heatingState;
    State coolingState;
    State currentState;
    int mode; //0 is off, 1 is on
    int temp;
    int tempChange; //0 is no change, -1 is decrease, 1 is increase
    int power; //0 is off, 1 is on

    public OperatingState(ACSystem ac) {
        this.ac = ac;

        heatingState = new HeatingState(this);
        coolingState = new CoolingState(this);
        currentState = heatingState;
        this.mode = 0;
        this.temp = 21;
        this.tempChange = 0;
        power = 0;
    }

    public String getName() {
        return ac.getName();
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void setState(State state) {
        currentState = state;
    }

    @Override
    public void changeModeButtonPressed() {
        if (power == 0) {

        } else {
            String str = "switching " + ac.getName() ;
            if (currentState == heatingState) {
                setState(coolingState);
                temp = 23;
                str += " to cooling at 23 both machines off";
            } else {
                setState(heatingState);
                temp = 21;
                str +=  " to heating at 21 both machines off";
            }
            System.out.println(str);
            currentState.changeModeButtonPressed();
        }
    }

    @Override
    public void increaseTempButtonPressed() {
        if (power == 0) {
            heatingState.increaseTempButtonPressed();
            coolingState.increaseTempButtonPressed();
        } else {
            temp += 1;
            currentState.increaseTempButtonPressed();
        }
    }

    @Override
    public void decreaseTempButtonPressed() {
        if (power == 1) {
            temp -= 1;
            currentState.decreaseTempButtonPressed();
        }
    }

    @Override
    public void powerButtonPressed() {
        power = (power == 0)? 1: 0;
        if (power == 1)
        {
            heatingState.powerButtonPressed();
            coolingState.powerButtonPressed();
        }
    }

    public String toString() {
        if (power == 1) {
            return heatingState.toString() + " and " + coolingState.toString();
        } else {
            return "";
        }
    }
}
