import Character.CharacterPJ;
import Character.Job.Job;
import Character.Job.Soldier;
import Character.Race.Elf;
import Character.Race.Gnomo;
import Character.Race.Orc;
import Character.Race.Race;
import Character.Stat.*;
import Item.Armor.Armor;
import Item.Armor.Shield;


public class Main {
    public static void main(String[] args) {

        Race elf = new Elf();
        Race gnomo = new Gnomo();
        Job soldier = new Soldier();
        Constitution constitution = new Constitution(5);
        Dexterity dexterity = new Dexterity(5);
        Intelligence intelligence = new Intelligence(5);
        Strength strength = new Strength(5);
        Armor armor = new Shield();



        CharacterPJ character1 = new CharacterPJ("Leila", elf, soldier, constitution, dexterity, intelligence, strength);
        CharacterPJ character2 = new CharacterPJ("Zeus", gnomo, soldier, constitution, dexterity, intelligence, strength);
        character1.toEquip(armor);

        System.out.println(character1.toString());
    }
}
