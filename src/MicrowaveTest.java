import static org.junit.Assert.*;
import org.junit.Test;

public class MicrowaveTest {

    @Test
    public void switchPowerLevel() {
        Microwave testMicrowave = new Microwave();

        testMicrowave.switchPowerLevel();
        assertEquals("Cooking for 0 seconds at Power Level 2", testMicrowave.pressStart());

    }

    @Test
    public void reset() {
        Microwave testMicrowave = new Microwave();

        //Switch to 1 minute
        testMicrowave.add30Seconds();
        testMicrowave.add30Seconds();

        //Reset Microwave
        testMicrowave.reset();

        //test
        assertEquals("Cooking for 0 seconds at Power Level 1", testMicrowave.pressStart());

    }

    @Test
    public void add30Seconds() {
        Microwave testMicrowave = new Microwave();

        //Switch to 1 minute
        testMicrowave.add30Seconds();
        testMicrowave.add30Seconds();

        //test
        assertEquals("Cooking for 60 seconds at Power Level 1", testMicrowave.pressStart());
    }

    @Test
    public void pressStart() {
        Microwave testMicrowave = new Microwave();

        assertEquals("Cooking for 0 seconds at Power Level 1", testMicrowave.pressStart());
    }
}