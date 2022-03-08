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

    @AfterEach
    void tearDown() {
    }

    @Test
    void getValue() {
    }

    @Test
    void increase() {
    }

    @Test
    void decrease() {
    }

    @Test
    void testToString() {
    }
}