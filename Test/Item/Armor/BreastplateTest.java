package Item.Armor;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Item.Jewerly.Jewerly;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreastplateTest {

    Stat stat;
    Armor armor;

    @Test
    void BreastplateInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        stat = new Intelligence(0);
        assertEquals(4, armor.statModifier(stat));
    }

    @Test
    void BreastplateInitialValue_Modifier_ReturnInitialValueModifierByStrength() {
        stat = new Dexterity(0);
        assertEquals(1, armor.statModifier(stat));
    }
}