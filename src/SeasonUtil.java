import java.util.ArrayList;
import java.util.Arrays;

/**
 * The SeasonUtil class provides utility methods related to seasons.
 */
public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();

    /**
     * Sorts an array of objects that implement the Comparable interface.
     * The method uses the Arrays.sort() method to perform the sorting.
     * @param seasonables An array of objects that implement the Comparable interface called Season.
     */
    public static void sortSeasonable(Comparable[] seasonables) {
        Arrays.sort(seasonables);
    }

    /**
     * Creates a report of all the objects in the array of Seasonable objects.
     * This is done by calling the toString() method of each object and representing the string.
     * @param seasonables An array of Seasonable objects.
     * @return A String containing the report of all the Seasonable objects.
     */
    static String reportAll(Seasonable[] seasonables) {
        String report="";
        for(Seasonable item: seasonables) {
            report += item.toString() +"\n";
        }
        return report;
    }
}
