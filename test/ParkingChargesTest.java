import chapterSix.ParkingCharges;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingChargesTest {

    @Test
    public void testCalculateCharges() {
        double charge1 = ParkingCharges.calculateCharges(1);
        assertEquals(2.00, charge1, 0.01);

        double charge2 = ParkingCharges.calculateCharges(2);
        assertEquals(2.00, charge2, 0.01);

        double charge3 = ParkingCharges.calculateCharges(3);
        assertEquals(2.00, charge3, 0.01);

        double charge4 = ParkingCharges.calculateCharges(4);
        assertEquals(2.50, charge4, 0.01);

        double charge5 = ParkingCharges.calculateCharges(5);
        assertEquals(3.00, charge5, 0.01);

        double charge24 = ParkingCharges.calculateCharges(24);
        assertEquals(10.00, charge24, 0.01);

        double charge25 = ParkingCharges.calculateCharges(25);
        assertEquals(10.00, charge25, 0.01);
    }
}
