package states;

/**
 * Created by archer on 2016-10-06.
 */
public class Available extends State {

    @Override
    public State invite() {
        //send invite

        return new Ringing();
    }

    @Override
    public State invited(String suplementalData) {
        //save socket of client

        //send TRO

        return new RingingInvited();
    }

    @Override
    public String toString() {
        return "Available{}";
    }
}

