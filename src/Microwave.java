
/*
A microwave control panel has four buttons: one for increasing the time by 30
seconds, one for switching between power levels 1 and 2, a reset button, and a start
button. Implement a class that simulates the microwave, with a method for each button.
The method for the start button should print a message “Cooking for ... seconds
at level ...”.
 */


/**
 * Microwave Class - simulate a microwave with methods like power level, time and start
 */
public class Microwave {

    /**
     * @param powerLevel - Save Microwave Power Level
     * @param seconds - saves cooking time in seconds
     */
    private int powerLevel;
    private int seconds;

    /**
     * Microwave Constructor
     * sets microwave power level 1
     * sets cooking time to 0 in seconds
     */
    public Microwave(){
        powerLevel=1;
        seconds=0;
    }

    /**
     * Microwave Constructor that takes
     * user input at an int and sets the
     * cooking time
     * @param userSeconds
     */
    public Microwave(int userSeconds){
        powerLevel=10;
        seconds=userSeconds;
    }

    /**
     * Switch Power Level from 1 to 2 or visa Versa
     */
    public void switchPowerLevel(){
        if(powerLevel==1)
        {
            powerLevel=2;
        }else
        {
            powerLevel=1;
        }
    }


    /**
     * Resets the seconds private class variable
     */
    public void reset()
    {
        seconds=0;
    }

    /**
     * Adds 30 seconds to seconds interval
     */
    public void add30Seconds(){
        seconds +=30;
    }

    /**
     *
     * @return String of the message for the powerLevel
     */
    public String pressStart(){
        String s = "Cooking for " + seconds + " seconds at Power Level " + powerLevel;
        return s;
    }

    public int getLevel()
    {
        return powerLevel;
    }

    public int getSeconds()
    {
        return seconds;
    }

}
