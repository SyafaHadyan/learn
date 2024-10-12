package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class MigratoryBirds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        ArrayList<Integer> sightings = new ArrayList<>();
        boolean resetCounter = false;
        //StringBuilder mostSightingsStrbuilder = new StringBuilder("0");
        /*
         * TODO: mostSightings must be lowest type of most seen bird
         */
        for (int i = 0; i < arrayLength; i++)
        {
            sightings.add(Integer.parseInt(input.next()));
        }
        input.close();
        Collections.sort(sightings);
        int checkType = sightings.get(0);
        int checkSightings = 0;
        int mostType = sightings.get(0);
        int mostSightings = 0;
        for (int i = 0; i < sightings.size(); i++)
        {
            if (!(checkType == sightings.get(i)))
            {
                checkType = sightings.get(i);
                resetCounter = true;
            }
            if ((checkType > mostType) && (checkSightings > mostSightings))
            {
                mostType = checkType;
                mostSightings = checkSightings;
                continue;
            }
            if (sightings.get(i) == checkType)
            {
                if (resetCounter)
                {
                    checkSightings = 0;
                }
                checkSightings++;
            }
        }
    }
}