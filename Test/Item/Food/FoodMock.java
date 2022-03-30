package Item.Food;

public class FoodMock extends Food{

    private double weight = 5;

    public FoodMock(int power, double weight) {
        super(power, weight);
    }
     @Override
    public double objectWeight(){
        return weight;
    }
}
