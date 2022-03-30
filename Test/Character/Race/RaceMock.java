package Character.Race;

import Character.Stat.Stat;

public class RaceMock extends Race{

    private int modifierValue;

    public int getModifierValue() {
        return modifierValue;
    }

    public void setModifierValue(int modifierValue) {
        this.modifierValue = modifierValue;
    }

    public RaceMock(int modifierValue){
        this.modifierValue = modifierValue;
    }

    @Override
    public int modifier(Stat stat) {
        return modifierValue;
    }
}
