package Character.Job;

import Character.Stat.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonkTest {

    Job monk;

    @BeforeEach
    void setUp() { monk = new Monk();
    }

    @Test
    void MonkInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        Stat dexterity = new Dexterity(8);
        int expected = 2;
        assertEquals(expected,monk.modifier(dexterity));
    }
    @Test
    void MonklInitialValue_Modifier_ReturnInitialValueModifierByIntelligence() {
        Stat intelligence = new Intelligence(8);
        int expected = 2;
        assertEquals(expected,monk.modifier(intelligence));
    }
    @Test
    void MonkInitialValue_Modifier_ReturnInitialValueModifierByStrength() {
        Stat strength = new Strength(3);
        int expected = 1;
        assertEquals(expected, monk.modifier(strength));
    }
}