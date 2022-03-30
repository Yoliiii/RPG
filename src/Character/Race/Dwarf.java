package Character.Race;

import Character.Stat.*;

public class Dwarf extends Race{


    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence) {
            return 6;
        }
        if (stat instanceof Dexterity) {
            return 3;
        }
        if (stat instanceof Constitution) {
            return -4;
        }
        return 0;
    }
}
