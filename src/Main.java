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
 * 
 * Bonus: 
 * Display the largest jump between numbers (in the sequences above, it’s 4: 98 -> 102)
 * Display the total count of numbers
 * 
 * 
 * 
 * @author mmader
 */

public class Main {
    public static int MAX = 10000;

    public static void main(String[] args) {
        long startTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("hi!");
        
        //good times go here
        
        long endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Length: " + (endTime - startTime) + "ms");
    }

}
