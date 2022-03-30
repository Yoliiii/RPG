package Item.Weapon;

import Character.Stat.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrenadeTest {

    Stat stat;
    Weapon weapon;

    @Test
    void GrenadeInitialValue_Modifier_ReturnInitialValueModifierByStrength() {
        stat = new Strength(0);
        assertEquals(1, weapon.statModifier(stat));
    }

    @Test
    void GrenadeInitialValue_Modifier_ReturnInitialValueModifierByIntelligence() {
        stat = new Intelligence(0);
        assertEquals(2, weapon.statModifier(stat));
    }
    @Test
    void GrenadeInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        stat = new Dexterity(0);
        assertEquals(2, weapon.statModifier(stat));
    }
}