package Character.Job;

import Character.Stat.*;

public class Soldier extends Job{

    @Override
    public int modifier(Stat stat) {
        if(stat instanceof Strength){
            return 3;
        }
        if(stat instanceof Constitution){
            return 2;
        }
        return 0;
    }
}
