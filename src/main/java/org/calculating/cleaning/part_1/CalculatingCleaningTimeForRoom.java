package org.calculating.cleaning.part_1;

public class CalculatingCleaningTimeForRoom {
    /**
     * Calculate time for room 'Cold room' 2.5 x 3.5
     * (2 windows)
     *
     * @param args
     */
    public static void main(String[] args) {
        //General variables
        float timeForVacuumCleanerDefault = 1.5f;
        byte timeForMopDefault = 3, timeForWipeTheDust = 1, timeForWindowDefault = 5;

        String nameOfRoom_2 = "Cold room";
        double withOfRoom_2 = 2.5, lengthOfRoom_2 = 3.5;
        int numberOfWindow = 2;
        char typeOfCleaning = 'A';

        //Calculating time
        double timeForVacuumCleanerAndMop = withOfRoom_2 * lengthOfRoom_2
                * (timeForVacuumCleanerDefault + timeForMopDefault);
        double timeForWindow = numberOfWindow * timeForWindowDefault;

        double totalTime = timeForVacuumCleanerAndMop + timeForWindow;

        System.out.println("Total time for " + nameOfRoom_2 + " is " + totalTime);

        printLikeHeader("Finish work with ROOM 2");
    }
    
    private static void printLikeHeader (String text){
        String headerSymbol = "-".repeat(10);
        String spaces = " ".repeat(2);
        System.out.println(headerSymbol + spaces + text + spaces +headerSymbol);
    }
}
