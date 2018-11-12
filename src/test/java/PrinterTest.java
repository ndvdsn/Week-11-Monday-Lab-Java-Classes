import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {


    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 100);
    }

    @Test
    public void hasNumberOfPages(){
        assertEquals(50, printer.checkNumberOfPages());
    }

    @Test
    public void hasVolumeOfToner(){
        assertEquals(100, printer.checkVolumeOfToner());
    }

    @Test
    public void canPrint(){
        int x = 10;
        int y = 3;

        assertEquals(20, printer.print(x, y));

    }

    @Test
    public void canRefillPaper(){
        assertEquals(100, printer.refillPaper());

    }



}
