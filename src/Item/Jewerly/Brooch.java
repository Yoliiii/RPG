package Item.Jewerly;

import Character.Stat.*;
import Item.IEquippable;
import Item.IPickable;

public class Brooch implements IEquippable, IPickable {

    //Methods
    @Override
    public double statModifier(Stat stat) {
        if (stat instanceof Intelligence) {
            return 1;
        }
        if (stat instanceof Dexterity) {
            return 2;
        }
        if (stat instanceof Constitution) {
            return 2;
        }
        return 0;
    }

    @Override
    public double objectWeight() {
        return 3.75;
    }
}
