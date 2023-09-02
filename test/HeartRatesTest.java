import chapterThree.HeartRates;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRatesTest {
    HeartRates heartRates;

    @BeforeEach
    public void setup(){
        heartRates = new HeartRates("Martha",
                "Danladi",
                3,
                5,
                1997);
    }

    @Test
    void testHeartRate(){
        int age = heartRates.calculateAgeInYears(2023);
        assertEquals(26, age);
        int maximumRate = heartRates.maximumHeartRate(26);
        assertEquals(194, maximumRate);

    }
}
