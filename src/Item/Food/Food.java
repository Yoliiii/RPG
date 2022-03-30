package Item.Food;
import Character.CharacterPJ;
import Item.IConsumable;
import Item.IPickable;

public abstract class Food implements IConsumable, IPickable {

    //Attributes
    private int power;
    private double weight;

    //Constructor
    public Food(int power, double weight){
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
