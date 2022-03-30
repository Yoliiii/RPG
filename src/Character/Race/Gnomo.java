package Character.Race;

import Character.Stat.*;

public class Gnomo extends Race{


    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return 4;
        }
        if (stat instanceof Intelligence) {
            return 3;
        }
        if (stat instanceof Strength) {
            return -2;
        }
        return 0;
    }
}
