package Item.Armor;

import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Whip extends Armor{

    //Methods
    @Override
    public double statModifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return 1;
        }
        if (stat instanceof Strength) {
            return 4;
        }
        return 0;
    }

    @Override
    public double objectWeight() {
        return 5;
    }
}
