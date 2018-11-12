import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void canAdd3To7AndGet10(){
       int x = 3;
       int y = 7;
       assertEquals(calculator.add(3, 7), 10);

    }


    @Test
    public void canSubtract4From9AndGet5(){
        int x = 9;
        int y = 4;
        assertEquals(calculator.subtract(9, 4), 5);
    }

    @Test
    public void canMultiply6By3andGet18(){
        int x = 6;
        int y = 3;
        assertEquals(calculator.multiply(6, 3), 18);
    }

    @Test
    public void canDivide8by2AndGet4(){
        int x = 8;
        int y = 2;
        assertEquals(calculator.divide(8, 2), 4);
    }
}


