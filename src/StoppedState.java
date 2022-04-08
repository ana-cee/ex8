package src;

public class StoppedState extends State{
    ACSystem ac;
    int power;

    public StoppedState(ACSystem ac) {
        super();
        this.ac = ac;
        power = 0;
    }

    @Override
    public void changeModeButtonPressed() {
        if (power == 0)
        {
            System.out.println(ac.getName() + ": no change of mode since system is off");
        }
    }

    @Override
    public void increaseTempButtonPressed() {

    }

    @Override
    public void decreaseTempButtonPressed() {
    }

    @Override
    public void powerButtonPressed() {
        power = (power == 0)? 1: 0;
        if (power == 1) {

        }
    }

    public String toString() {
        if (power == 0) {
            return "system off";
        } else {
            return "switch on A/C " + ac.getName();
        }

    }
}
