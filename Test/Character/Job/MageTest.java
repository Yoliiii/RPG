package Character.Job;

import Character.Stat.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    Job mage;

    @BeforeEach
    void setUp() {
        mage = new Mage();
    }

    @Test
    void MageInitialValue_Modifier_ReturnInitialValueModifierByIntellligence() {
        Stat intelligence = new Intelligence(3);
        int expected = 4;
        assertEquals(expected, mage.modifier(intelligence));
    }

    @Test
    void MageInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        Stat dexterity = new Dexterity(6);
        int expected = 1;
        assertEquals(expected, mage.modifier(dexterity));
    }
}