package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.*;
import Item.IConsumable;
import Item.IEquippable;
import Item.IPickable;

import java.util.ArrayList;
import java.util.List;

public class CharacterPJ implements IDamageable {

    //Attributes

    private String name;
    private Race race;
    private Job job;
    private Constitution constitution;
    private Dexterity dexterity;
    private Intelligence intelligence;
    private Strength strength;
    private double damage;
    private List<IEquippable>EquippablesList= new ArrayList<>();
    private List<IPickable>inventory= new ArrayList<>();


    //Constructor

    public CharacterPJ(String name, Race race, Job job, Constitution constitution, Dexterity dexterity, Intelligence intelligence, Strength strength) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.constitution = constitution;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.strength = strength;
    }

    //Methods

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Job getJob() {
        return job;
    }

    //(Dexterity base value + bonus.race + bonus.profession) *2
    public double velocity() {
        return dexterity.getValue() + race.modifier(dexterity) + job.modifier(dexterity) * 2;
    }

    //(Strength base value + bonus.race + bonus.profession) *2
    public double power() {
        return strength.getValue() + race.modifier(strength) + job.modifier(strength) * 2;
    }

    //(Intelligence base value + bonus.race + bonus.profession) *2
    public double magic() {
        return intelligence.getValue() + race.modifier(intelligence) + job.modifier(intelligence) * 2;
    }

    @Override
    public String toString() {
        return "My name is: " + name + "." + "I'm an " + getRace() + getJob() +
                "My stats are: " + "\n" +
                "Strength: " + strength.getValue() + "\n" +
                "Dexterity: " + dexterity.getValue() + "\n" +
                "Constitution: " + constitution.getValue() + "\n" +
                "Intelligence: " + intelligence.getValue() + "\n" +
                "Velocity: " + velocity() + "\n" +
                "Power: " + power() + "\n" +
                "Magic: " + magic() + "\n" +
                "Health: " + maxHealth();
    }

    //(Costitution base value + bonus race + profession bonus) *25
    @Override
    public double maxHealth() {
        return constitution.getValue() + race.modifier(constitution) + job.modifier(constitution) *25;
    }

    //Returns the current health value
    @Override
    public double health() {
        return maxHealth() - damage;
    }

    //Returns true if the damage is greater than or equal to life
    @Override
    public boolean isDead() {
        if(damage >= maxHealth()){
            return true;
        }
        return false;
    }

    //Increases damage taken
    @Override
    public void receivesDamage(double amount) {
        damage += amount;
        System.out.println(name + "received" + amount + "damage." + "Health: " + health());
    }

    //Decrease damage taken. Minimum damage is 0
    @Override
    public void heals(double amount) {
        damage -= amount;
        System.out.println(name + "healed" + health() + "life." + "Health" + health());
    }

    //Functionality of being able to consume consumables.
    public void consumes(IConsumable consumable){
        System.out.println(name + "consumed: " + consumable);
        consumable.consumedBy(this);
    }

    //Method to add objects.
    public void toEquip(IEquippable iEquippable){
        EquippablesList.add(iEquippable);
    }

    //Method to add objects to my inventory.
    public void pickable(IPickable iPickable){
        if (this.power() > iPickable.objectWeight()) {
            inventory.add(iPickable);
        }else{
            System.out.println("A lot of weight");
        }
    }
}
