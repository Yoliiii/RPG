package Item.Jewerly;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;
import Item.IEquippable;
import Item.IPickable;

public class Bracelet implements IEquippable, IPickable {

    //Methods
    @Override
    public double statModifier(Stat stat) {
        if (stat instanceof Constitution) {
            return 3;
        }
        if (stat instanceof Dexterity) {
            return 2;
        }
        return 0;
    }

    @Override
    public double objectWeight() {
        return 2;
    }
}
