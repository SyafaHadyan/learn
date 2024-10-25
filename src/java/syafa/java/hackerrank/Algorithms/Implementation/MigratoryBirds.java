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
        Arrays.sort(sighting);
        int currentMode = 1;
        int currentType = 0;
        int mode = 1;
        int mostType = Integer.MAX_VALUE;
        for (int i = sighting.length - 1; i >= 0; i--)
        {
            try
            {
                currentType = sighting[i];
                if (currentType == sighting[i + 1])
                {
                    currentMode++;
                }
                if (currentMode >= mode)
                {
                    mode = currentMode;
                    if (currentType != sighting[i - 1])
                    {
                        currentMode = 1;
                    }
                    if (currentType < mostType)
                    {
                        mostType = currentType;
                    }
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
        System.out.print(mostType);
    }
}