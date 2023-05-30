import chapterThree.PetrolPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolTest {
    @Test
    void calculatePurchaseAmount(){
        PetrolPurchase petrol = new PetrolPurchase("Lagos", "WPS", 50, 150.50, 20);
        double amount = petrol.getPurchaseAmount();
        assertEquals(6020, amount);



    }
}
