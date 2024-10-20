package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class MigratoryBirds
{
    public static void main(String[] args)
    {
        /*
         * 6
         * 1 4 4 4 5 3
         * 
         * 4
         * 
         * 11
         * 1 2 3 4 5 4 3 2 1 3 4
         * 
         * 3
         * 
         * sort reverse array of sightings (start from highest type) then when lower type has higher sightings, update mode to current type (which is lower)
         */
        Scanner input = new Scanner(System.in);
        //int sightingAmount = Integer.parseInt(input.nextLine());
        int[] sighting = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Collections.reverse(Arrays.asList(sighting));
        int currentMode = 0;
        int currentType = 0;
        int mode = 0;
        int mostType = Integer.MAX_VALUE;
        for (int i = 0; i < sighting.length; i++)
        {
            currentType = sighting[i];
            if (currentType == sighting[i--])
            {
                currentMode++;
            }
            if ((sighting[i] == sighting[i++]) && (currentType < mostType))
            {
                mode = currentMode;
                currentMode = 0;
            }
        }
    }
}