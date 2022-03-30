package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Orc extends Race {


    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return 5;
        }
        if (stat instanceof Constitution) {
            return 3;
        }
        if (stat instanceof Intelligence) {
            return -3;
        }
        return 0;
    }
}
