package Item.Potion;
import Character.CharacterPJ;
import Item.IConsumable;
import Item.IPickable;

public abstract class Potion implements IConsumable, IPickable {

    //Attibutes
    private int power;
    private double weight;

    //Constructor
    public Potion(int power, double weight){
        this.power = power;
        this.weight = weight;
    }

    //Methods
    @Override
    public void consumedBy(CharacterPJ characterPJ){

    }

    @Override
    public double objectWeight(){
        return weight;
    }
}
