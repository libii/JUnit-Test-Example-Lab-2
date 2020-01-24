import org.junit.Test;

import static org.junit.Assert.*;

public class MicrowaveTest {

    @Test
    public void switchPowerLevel() {
        Microwave testMicrowave = new Microwave();
        assertEquals("Cooking for 0 seconds at Power Level 1",testMicrowave.pressStart());

    }

    @Test
    public void reset() {
    }

    @Test
    public void add30Seconds() {
    }

    @Test
    public void pressStart() {
        Microwave testMicrowave = new Microwave();
        assertEquals("Cooking for 0 seconds at Power Level 1",testMicrowave.pressStart());
    }


}