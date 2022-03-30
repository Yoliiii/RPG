package Item.Armor;

import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhipTest {

    Stat stat;
    Armor armor;

    @Test
    void WhipInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        stat = new Dexterity(0);
        assertEquals(1, armor.statModifier(stat));
    }

    @Test
    void WhipInitialValue_Modifier_ReturnInitialValueModifierByStrength() {
        stat = new Strength(0);
        assertEquals(4, armor.statModifier(stat));
    }
}