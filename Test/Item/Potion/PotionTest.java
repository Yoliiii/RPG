package Item.Potion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PotionTest {

    Potion potion;

    @BeforeEach
    void setUp() { potion = new PotionMock(4);
    }
}