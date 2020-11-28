import instruments.BagPipeType;
import instruments.BagPipes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BapPipeTest {

    public BagPipes myChanters;

    @Before
    public void setUp(){
        myChanters = new BagPipes("Duncan MacRae", "SL1", 950, 1150);
    }

    @Test
    public void canGetRetailPrice(){
        assertEquals(1150, myChanters.getRetailPrice(), 0.01);
    }

    @Test
    public void canSetNewRetailPrice(){
        myChanters.setRetailPrice(850);
        assertEquals(850, myChanters.getRetailPrice(), 0.01);
    }
}
