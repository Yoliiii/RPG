package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssassinTest {

    Job assassin;

    @BeforeEach
    void setUp() { assassin = new Assassin();
    }

    @Test
    void AssassinInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        Stat dexterity = new Dexterity(1);
        int expected = 3;
        assertEquals(expected,assassin.modifier(dexterity));
    }
    @Test
    void AssassinlInitialValue_Modifier_ReturnInitialValueModifierByStrength() {
        Stat strength = new Strength(2);
        int expected = 1;
        assertEquals(expected,assassin.modifier(strength));
    }
    @Test
    void AssassinInitialValue_Modifier_ReturnInitialValueModifierByConstitution() {
        Stat constitution = new Constitution(4);
        int expected = 1;
        assertEquals(expected, assassin.modifier(constitution));
    }
}