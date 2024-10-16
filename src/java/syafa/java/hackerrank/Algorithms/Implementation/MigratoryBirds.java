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
        int mode = 0;
        int currentMinVal = 0;
        int currentMaxMode = 1;
        int maxMode = 0;
        for (int i = 0; i < sightings.length; i++)
        {
            try
            {
                if (i == 0)
                {
                    mode = sightings[i];
                    maxMode = sightings[i];
                }
                if (sightings[i] == sightings[i + 1])
                {
                    currentMaxMode++;
                }
                if ((currentMaxMode > mode) && (sightings[i] > currentMinVal))
                {
                    mode = currentMaxMode;
                    currentMinVal = sightings[i];
                    maxMode = sightings[i];
                    currentMaxMode = 1;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.print(maxMode);
            }
        }
    }
}