package Item.Weapon;

import Character.Stat.*;

public class Grenade extends Weapon{

    //Methods
    @Override
    public double statModifier(Stat stat) {
        if (stat instanceof Strength) {
            return 1;
        }
        if (stat instanceof Intelligence) {
            return 2;
        }
        if (stat instanceof Dexterity) {
            return 2;
        }
        return 0;
    }

    @Override
    public double objectWeight() {
        return 3.5;
    }
}
