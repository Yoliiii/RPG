package Item.Jewerly;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BraceletTest {

    Stat stat;
    Jewerly jewerly;

    @Test
    void BraceletInitialValue_Modifier_ReturnInitialValueModifierByConstitution() {
        stat = new Constitution(0);
        assertEquals(3, jewerly.statModifier(stat));
    }

    @Test
    void BraceletInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        stat = new Dexterity(0);
        assertEquals(2, jewerly.statModifier(stat));
    }
}