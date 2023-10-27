package org.calculating.cleaning.part_1;

public class CalculatingCleaningTimeForRoom_Example {
    /**
     * Goals:
     * - Try different types of variables
     * - Try different types of operators
     * - Try concatenation of strings
     * - Try String.format("some text %s", variable)
     * - Try 'System.out.print'
     * - Try different types of comments
     * - Work on one class
     */
    /**
     * Advantages:
     * - Easy to use
     * - Easy to understand
     * Disadvantages:
     * - Not easy to support
     * - Not easy to extend
     * - Not easy to read
     *
     */
    /**
     * Task1:
     * 1.1 Calculate time for cleaning one room 'Living room' 3.5x4
     * (2 pieces of furniture and 1 window )
     * <p>
     * Assumptions:
     * for 1 square meter of room we need 1.5 minute to clean it by vacuum cleaner
     * for 1 square meter of room we need 3 minute to clean it by mop
     * for wipe the dust on one piece of furniture we need 1 minute
     * for clean the window we need 5 minutes
     */


    public static void main(String[] args) {
        //         General variables
        float timeForVacuumCleanerDefault = 1.5f;
        byte timeForMopDefault = 3; // can be byte, short, int, long
        byte timeForWipeTheDustDefault = 1;
        byte timeForWindowsDefault = 5;

        //  1.1 Calculate time for cleaning one room 3.5x4 (2 pieces of furniture and 1 window)
        String nameOfRoom_1 = "Living room";

        int numberOfFurnitureRoom_1 = 2;
        int numberOfWindowsRoom_1 = 1;
        double widthOfRoom_1 = 3.5;
        double lengthOfRoom_1 = 4.25;

        String longNameOfRoom_1 = nameOfRoom_1 + " " + widthOfRoom_1 + "x" + lengthOfRoom_1
                + " (2 pieces of furniture and 1 window)"; //concatenation of strings
        System.out.println(longNameOfRoom_1);
        String longNameOfRoom_1_with_4_params =
                String.format("%s %sx%s (%s pieces of furniture and %s window)",
                        nameOfRoom_1, widthOfRoom_1, lengthOfRoom_1, numberOfFurnitureRoom_1, numberOfWindowsRoom_1);
        System.out.println(longNameOfRoom_1_with_4_params);

        //System.out.println("--------- Starting calculations for Room 1 ---------");
        printTextLikeHeader("Starting calculations for Room 1");

        double areaOfRoom_1 = rounding(widthOfRoom_1 * lengthOfRoom_1);
        System.out.println("Area is " + areaOfRoom_1);

        //Vacuum cleaner and mop
        double timeForVacuumCleanerAndMopRoom_1 = areaOfRoom_1 * (timeForVacuumCleanerDefault + timeForMopDefault);
        System.out.println("Time for vacuum cleaner and mop is " + timeForVacuumCleanerAndMopRoom_1);

        //Furniture
        double timeForFurnitureRoom_1 = numberOfFurnitureRoom_1 * timeForWipeTheDustDefault;
        System.out.println("Time for furniture is " + timeForFurnitureRoom_1);

        //Windows
        double timeForWindowsRoom_1 = numberOfWindowsRoom_1 * timeForWindowsDefault;
        System.out.println("Time for windows is " + timeForWindowsRoom_1);

        //Total
        double totalTimeForRoom_1 = timeForVacuumCleanerAndMopRoom_1 + timeForFurnitureRoom_1 + timeForWindowsRoom_1;
        System.out.println("Total time for " + longNameOfRoom_1 + " is " + totalTimeForRoom_1);

        //System.out.println("--------- Finish calculations for Room 2 ---------");
        printTextLikeHeader("Finish calculations for Room 2");

    }

    private static void printTextLikeHeader(String text) {
        System.out.println("--------- " + text + " ---------");
    }

    private static double rounding(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

}
