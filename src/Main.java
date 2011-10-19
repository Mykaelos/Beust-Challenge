import java.util.Calendar;

/**
 * Beust Challenge: Write a counter function that counts from 1 to MAX but only
 * returns numbers whose digits don't repeat.
 * 
 * For example:
 * 8, 9, 10, 12, 13 (11 is not valid)
 * 98, 102, 103 (99, 100, and 101, are not valid)
 * 5432, 5436, 5437 (5433, 5434 and 5435 are not valid)
 * 
 * Bonus: 
 * 10pts: Display the largest jump between numbers (in the sequences above, it’s 4: 98 -> 102)
 * 5pts:  Display the total count of numbers
 * 30pts: Use the BONUS_MAX instead of MAX, but make it run in under 15 minutes.
 * 
 * @author mmader
 */

public class Main {
    public static long MAX = 10000;
    public static long BONUS_MAX = 10000000000l;

    public static void main(String[] args) {
        long startTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("hi!");
        
        //good times go here
        
        long endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Length: " + (endTime - startTime) + "ms");
    }
}
