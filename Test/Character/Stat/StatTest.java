package Character.Stat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatTest {

    Stat stat;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        stat = new StatMoc(2);
    }

    @Test
    void InitialValue_Increase_ReturnInitialValueIncreasedBy1() {
        int actualValue = stat.getValue();
        stat.increase();
        assertEquals(actualValue+1, stat.getValue());
    }

    @Test
    void InitialValue_Decrease_ReturnInitialValueDecreasedBy1() {
        int actualValue = stat.getValue();
        stat.decrease();
        assertEquals(actualValue-1, stat.getValue());
    }
}