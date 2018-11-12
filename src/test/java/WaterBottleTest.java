import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {


    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkRemoves10(){
        assertEquals(90, waterBottle.drink10());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fullBottle(){
        assertEquals(100, waterBottle.fullBottle());
    }
}
