package Character;

import Character.Job.JobMock;
import Character.Race.Race;
import Character.Race.RaceMock;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Item.IConsumable;
import Item.IEquippable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterPJTest {

    JobMock jobMock;
    RaceMock raceMock;
    Strength strength;
    Intelligence intelligence;
    Dexterity dexterity;
    Constitution constitution;
    CharacterPJ characterPJ;

    @BeforeEach
    void setUp() {
        //Objects
        jobMock = new JobMock(4);
        jobMock.setModifierValue(6);
        raceMock = new RaceMock(3);
        jobMock.setModifierValue(5);
        strength = new Strength(5);
        intelligence = new Intelligence(5);
        dexterity = new Dexterity(5);
        constitution = new Constitution(5);
        characterPJ = new CharacterPJ("Kaira", raceMock, jobMock, constitution, dexterity, intelligence, strength);
    }

    @Test
    void Character_VelocityCharacter_ReturnsVelocityCharacter() {
        int velocity = (dexterity.getValue()+raceMock.modifier(dexterity)+jobMock.modifier(dexterity))*2;
        assertEquals(velocity,characterPJ.velocity());
    }

    @Test
    void Character_PowerCharacter_ReturnsPowerCharacter() {
        int power = (dexterity.getValue()+raceMock.modifier(dexterity)+jobMock.modifier(dexterity))*2;
        assertEquals(power,characterPJ.velocity());
    }

    @Test
    void Character_MagicCharacter_ReturnsMagicCharacter() {
        int magic = (dexterity.getValue()+raceMock.modifier(dexterity)+jobMock.modifier(dexterity))*2;
        assertEquals(magic,characterPJ.magic());
    }

    @Test
    void maxHealth() {
        int maxHealth = (constitution.getValue()+raceMock.modifier(constitution))*25;
        assertEquals(maxHealth, characterPJ.maxHealth());
    }

    @Test
    void health() {
        double damage = 10;
        characterPJ.receivesDamage(damage);
        double health = characterPJ.maxHealth() - damage;
        assertEquals(health, characterPJ.health());
    }

    @Test
    void isDead() {
        double damage = 9;
        boolean isDead = damage >= characterPJ.health();
        assertEquals(isDead, characterPJ.isDead());
    }

    @Test
    void receivesDamage() {
        double damage = 100;
        characterPJ.receivesDamage(damage);
        double health = characterPJ.health();
        assertEquals(health, characterPJ.health());
    }

    @Test
    void heals() {
        double heals = 100;
        characterPJ.heals(heals);
        double health = characterPJ.health();
        assertEquals(health,characterPJ.health());

    }

    @Test
    void Name_GetName_ReturnsName() {
        String nombre = characterPJ.getName();
        assertEquals("Leila", nombre);
    }

    @Test
    void Race_GetRace_ReturnsRace() {
        Race race = characterPJ.getRace();
        assertEquals(race, raceMock);

    }
}

