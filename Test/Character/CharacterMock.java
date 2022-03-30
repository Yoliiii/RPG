package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;

public class CharacterMock extends CharacterPJ{
    public CharacterMock(String name, Race race, Job job, Constitution constitution, Dexterity dexterity, Intelligence intelligence, Strength strength) {
        super(name, race, job, constitution, dexterity, intelligence, strength);
    }
}
