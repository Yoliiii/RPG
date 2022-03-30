package Character.Race;

import Character.Stat.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcTest {

    Race orc;

    @BeforeEach
    void setUp() { orc = new Orc();
    }

    @Test
    void OrcInitialValue_Modifier_ReturnInitialValueModifierByStrength() {
        Stat strength = new Strength(6);
        int expected = 5;
        assertEquals(expected,orc.modifier(strength));
    }
    @Test
    void OrcInitialValue_Modifier_ReturnInitialValueModifierByConstitution() {
        Stat constitution = new Constitution(5);
        int expected = 3;
        assertEquals(expected,orc.modifier(constitution));
    }
    @Test
    void OrcInitialValue_Modifier_ReturnInitialValueModifierByIntelligence() {
        Stat intelligence = new Intelligence(3);
        int expected = -3;
        assertEquals(expected, orc.modifier(intelligence));
    }
}