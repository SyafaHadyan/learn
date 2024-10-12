package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class MigratoryBirds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        ArrayList<Integer> sightings = new ArrayList<>();
        input.close();
        //StringBuilder mostSightingsStrbuilder = new StringBuilder("0");
        /*
         * TODO: mostSightings must be lowest type of most seen bird
         */
        boolean resetCounter = true;
        int checkType = Integer.MIN_VALUE; // get i
        int checkSightings = Integer.MIN_VALUE; // check get i
        int currentMostType = Integer.MIN_VALUE; // if true
        int mostSightings = Integer.MIN_VALUE; //
        for (int i = 0; i < arrayLength; i++)
        {
            sightings.add(Integer.parseInt(input.next()));
        }
        Collections.sort(sightings);
        checkType = sightings.get(0);
        for (int i = 0; i < sightings.size(); i++)
        {
            if (!(checkType == sightings.get(i)))
            {
                checkType = sightings.get(i);
            }
            if ((checkType > currentMostType) && (checkSightings > mostSightings))
            {
                currentMostType = checkType;
                mostSightings = checkSightings;
            }
        }
    }
}