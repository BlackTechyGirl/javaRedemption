import chapterThree.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    void fivePercentDiscount(){
        Car car = new Car("Ferari", "2022", 5000);
        double discount = car.fivePercentDiscount();
        assertEquals(4750, discount);
    }

    @Test
    void sevenPercentDiscount(){
        Car car = new Car("Ferari", "2022", 5000);
        double discount = car.sevenPercentDiscount();
        assertEquals(4650, discount);
    }
}
