package Item.Food;

import Character.CharacterPJ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    Food food;

    @BeforeEach
    void setUp() { food = new FoodMock(4,6);
    }
}