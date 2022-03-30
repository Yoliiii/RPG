package Item.Jewerly;

import Character.Stat.*;
import Item.IEquippable;
import Item.IPickable;

public class Crown implements IEquippable, IPickable {

    //Methods
    @Override
    public double statModifier(Stat stat) {
        if (stat instanceof Intelligence) {
            return 4;
        }
        if (stat instanceof Strength) {
            return 1;
        }
        return 0;
    }

        @Override
        public double objectWeight() {
            return 4;
        }
    }
