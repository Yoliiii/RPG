package Character;

import Character.Stat.Constitution;

public interface IDamageable {

    //Methods

    //(Constitution base value + bonus.race + bonus.profession) *25
    public double maxHealth();

    //Returns the value of the current life
    public double health();

    //Returns true if damage is greater than or equal to life
    public boolean isDead();

    //Increase damage taken
    public void receivesDamage(double amount);

    //Decrease damage taken. Minimum damage is 0
    public void heals(double amount);

}
