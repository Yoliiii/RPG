package Character.Job;

import Character.Stat.Stat;

public class JobMock extends Job {

    private int modifierValue;

    public int getModifierValue() {
        return modifierValue;
    }

    public void setModifierValue(int modifierValue) {
        this.modifierValue = modifierValue;
    }

    public JobMock(int modifierValue) {
        this.modifierValue = modifierValue;
    }

    @Override
    public int modifier(Stat stat) {
        return modifierValue;
    }
}
