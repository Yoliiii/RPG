package Item.Weapon;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Crossbow extends Weapon{

    //Methods
    @Override
    public double statModifier(Stat stat) {
        if (stat instanceof Constitution) {
            return 3;
        }
        if (stat instanceof Strength) {
            return 3;
        }
        if (stat instanceof Dexterity) {
            return -1;
        }
        return 0;
    }

    @Override
    public double objectWeight() {
        return 6;
    }
}
