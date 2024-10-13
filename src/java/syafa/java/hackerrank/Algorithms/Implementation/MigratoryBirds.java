package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class MigratoryBirds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        int[] sightings = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
        {
            sightings[i] = Integer.parseInt(input.next());
        }
        input.close();
        Arrays.sort(sightings);
        int checkType = sightings[0];
        int checkSightings = 0;
        int mostType = sightings[0];
        int mostSightings = 1;
        for (int i = 0; i < sightings.length; i++)
        {
            if (!(checkType == sightings[i]))
            {
                checkType = sightings[i];
                checkSightings = 0;
            }
            if (sightings[i] == checkType)
            {
                checkSightings++;
            }
            if ((checkType > mostType) && (checkSightings > mostSightings))
            {
                mostType = checkType;
                mostSightings = checkSightings;
            }
        }
        System.out.print(mostType);
    }
}