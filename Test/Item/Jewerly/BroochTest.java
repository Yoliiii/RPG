package Item.Jewerly;

import Character.Stat.*;
import Item.Weapon.Weapon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BroochTest {

    Stat stat;
    Jewerly jewerly;

    @Test
    void BroochInitialValue_Modifier_ReturnInitialValueModifierByIntelligence() {
        stat = new Intelligence(0);
        assertEquals(1, jewerly.statModifier(stat));
    }

    @Test
    void BroochInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        stat = new Dexterity(0);
        assertEquals(2, jewerly.statModifier(stat));
    }
    @Test
    void BroochInitialValue_Modifier_ReturnInitialValueModifierByConstitution() {
        stat = new Constitution(0);
        assertEquals(2, jewerly.statModifier(stat));
    }
}