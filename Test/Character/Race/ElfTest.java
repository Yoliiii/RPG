package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {

    Race elf;

    @BeforeEach
    void setUp() { elf = new Elf();
    }

    @Test
    void ElfInitialValue_Modifier_ReturnInitialValueModifierByDexterity() {
        Stat dexterity = new Dexterity(4);
        int expected = 3;
        assertEquals(expected,elf.modifier(dexterity));
    }
    @Test
    void ElfInitialValue_Modifier_ReturnInitialValueModifierByIntelligence() {
        Stat dexterity = new Dexterity(1);
        int expected = 3;
        assertEquals(expected,elf.modifier(dexterity));
    }
    @Test
    void ElfInitialValue_Modifier_ReturnInitialValueModifierByConstitution() {
        Stat constitution = new Constitution(6);
        int expected = -1;
        assertEquals(expected, elf.modifier(constitution));
    }
}