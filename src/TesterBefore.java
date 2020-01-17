

/**
 * Describe the problem:
 * The problem asks for four options: one for increase time by 30 seconds, one for switching levels between 1 to 2, one for reset, and one for start
 * Create private variables for seconds and level
 * To Solve Problem
 * Need a constructors to initialize the time and level.
 * Need a method to change the level
 * Need a method to reset the seconds
 * Need a method to increase the time
 * Need a method to start, which print out the line cooking for … second at level...
 *
 * Test the algorithm with simple inputs:
 * Set level to numbers 1 or 2 and increase time twice to see if it outputs 60 seconds
 * Increase time twice and reset it to see if the time is 0 seconds
 */

public class TesterBefore {
    public static void main(String[] args) {
        Microwave testMicrowave = new Microwave();


        //Testing Intial Constructor
        System.out.print("Actual: ");
        System.out.println(testMicrowave.pressStart());
        System.out.println("Expected: Cooking for 0 seconds at Power Level 1");

        //Switch Power Level
        testMicrowave.switchPowerLevel();

        //Test Power Level
        System.out.print("Actual: ");
        System.out.println(testMicrowave.pressStart());
        System.out.println("Expected: Cooking for 0 seconds at Power Level 2");

        //Switch to 1 minute
        testMicrowave.add30Seconds();
        testMicrowave.add30Seconds();

        //Test Power Level
        System.out.print("Actual: ");
        System.out.println(testMicrowave.pressStart());
        System.out.println("Expected: Cooking for 60 seconds at Power Level 2");

        //Reset Microwave
        testMicrowave.reset();

        //Test Reset
        System.out.print("Actual: ");
        System.out.println(testMicrowave.pressStart());
        System.out.println("Expected: Cooking for 0 seconds at Power Level 2");
    }
}
