package Character.Stat;

public abstract class Stat{

    //Attributes
    private int value;

    //Constructor
    public Stat(int value){
        this.value = value;
    }

    //Methods
    public int getValue() {
        return value;
    }
    public void increase(){
        value += 1;
    }
    public void decrease(){
        value -= 1;
    }

    @Override
    public String toString() {
        return "Stat" +
                "value=" + value;
    }
}
