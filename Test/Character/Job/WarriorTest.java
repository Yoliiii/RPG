package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    Job warrior;

    @BeforeEach
    void setUp() { warrior = new Warrior();
    }

    @Test
    void WarriorInitialValue_Modifier_ReturnInitialValueModifierByStrength() {
        Stat strength = new Strength(5);
        int expected = 3;
        assertEquals(expected,warrior.modifier(strength));
    }
    @Test
    void WarriorlInitialValue_Modifier_ReturnInitialValueModifierByConstitution() {
        Stat constitution = new Constitution(4);
        int expected = 2;
        assertEquals(expected,warrior.modifier(constitution));
    }
}