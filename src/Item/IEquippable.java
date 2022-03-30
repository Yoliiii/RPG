package Item;

import Character.Stat.Stat;

public interface IEquippable extends IPickable{

    //Methods
    double statModifier(Stat stat);
}
