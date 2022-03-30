package Item.Weapon;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrossbowTest {

    Stat stat;
    Weapon weapon;

    @Test
    void CrossbowInitialValue_Modifier_ReturnInitialValueModifierByConstitution() {
        stat = new Constitution(0);
        assertEquals(3, weapon.statModifier(stat));
    }

    @Test
    void CrossbowInitialValue_Modifier_ReturnInitialValueModifierByStrength() {
        stat = new Strength(0);
        assertEquals(3, weapon.statModifier(stat));
    }
    @Test
    void CrossbowInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        stat = new Dexterity(0);
        assertEquals(-1, weapon.statModifier(stat));
    }
}