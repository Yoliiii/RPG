package Character.Race;

import Character.Stat.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Race human;

    @BeforeEach
    void setUp() { human = new Human();
    }

    @Test
    void HumanInitialValue_Modifier_ReturnInitialValueModifierByStrength() {
        Stat strength = new Strength(6);
        int expected = 2;
        assertEquals(expected,human.modifier(strength));
    }
    @Test
    void HumanInitialValue_Modifier_ReturnInitialValueModifierByConstitution() {
        Stat constitution = new Constitution(5);
        int expected = 2;
        assertEquals(expected,human.modifier(constitution));
    }
    @Test
    void HumanInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        Stat dexterity = new Dexterity(3);
        int expected = 1;
        assertEquals(expected, human.modifier(dexterity));
    }
}