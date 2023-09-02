import chapterThree.Clock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    Clock clock;

    @BeforeEach
    public void setThisUp(){
        clock = new Clock(20, 20, 50);
    }

    @Test
    void testClockFunctions(){
        clock.setHour(22);
       assertEquals(22, clock.getHour());
       clock.setMinute(60);
       assertEquals(0, clock.getMinute());
       clock.setSecond(60);
       assertEquals(0, clock.getSecond());
    }

    @Test
    void testDisplayTime(){
        assertEquals("20:20:50", clock.displayTime());
    }
}

