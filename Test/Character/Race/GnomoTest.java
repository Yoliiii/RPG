package Character.Race;

import Character.Stat.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GnomoTest {

    Race gnomo;

    @BeforeEach
    void setUp() { gnomo = new Gnomo();
    }

    @Test
    void GnomoInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        Stat dexterity = new Dexterity(1);
        int expected = 4;
        assertEquals(expected,gnomo.modifier(dexterity));
    }
    @Test
    void GnomoInitialValue_Modifier_ReturnInitialValueModifierByIntelligence() {
        Stat intelligence = new Intelligence(2);
        int expected = 3;
        assertEquals(expected,gnomo.modifier(intelligence));
    }
    @Test
    void GnomoInitialValue_Modifier_ReturnInitialValueModifierByStrength() {
        Stat strength = new Strength(3);
        int expected = -2;
        assertEquals(expected, gnomo.modifier(strength));
    }
}