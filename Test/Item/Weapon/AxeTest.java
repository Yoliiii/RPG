package Item.Weapon;

import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AxeTest {

    Stat stat;
    Weapon weapon;

    @Test
    void AxeInitialValue_Modifier_ReturnInitialValueModifierByStrength() {
        stat = new Strength(0);
        assertEquals(4, weapon.statModifier(stat));
    }

    @Test
    void AxeInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        stat = new Dexterity(0);
        assertEquals(1, weapon.statModifier(stat));
    }
}