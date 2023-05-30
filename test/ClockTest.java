import chapterThree.Clock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    @Test
    void clockTest(){
        Clock clock = new Clock(24, 60, 60);
        assertEquals("00:00:00", clock.displayTime());


    }
}
