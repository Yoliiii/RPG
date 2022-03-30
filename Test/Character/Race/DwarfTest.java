package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DwarfTest {

    Race dwarf;

    @BeforeEach
    void setUp() { dwarf = new Dwarf();
    }


    @Test
    void DwarfInitialValue_Modifier_ReturnInitialValueModifierByIntelligence() {
        Stat intelligence = new Intelligence(3);
        int expected = 6;
        assertEquals(expected,dwarf.modifier(intelligence));
    }
    @Test
    void DwarfInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        Stat dexterity = new Dexterity(2);
        int expected = 3;
        assertEquals(expected,dwarf.modifier(dexterity));
    }
    @Test
    void DwarfInitialValue_Modifier_ReturnInitialValueModifierByConstitution() {
        Stat constitution = new Constitution(5);
        int expected = -4;
        assertEquals(expected, dwarf.modifier(constitution));
    }
}