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
        int mostType = Integer.MIN_VALUE;
        int currentMostType = Integer.MIN_VALUE;
        int mostSightings = Integer.MIN_VALUE;
        for (int i = 0; i < arrayLength; i++)
        {
            sightings.add(Integer.parseInt(input.next()));
        }
        Collections.sort(sightings);
        for (int i = 0; i < sightings.size(); i++)
        {
            if (resetCounter)
            {
                mostSightings = 1;
            }
            try
            {
                if ((sightings.get(i) == sightings.get(i + 1)))
                {
                    if ((sightings.get(i) > currentMostType) && (currentMostType == 0))
                    {
                        currentMostType = sightings.get(i);
                    }
                    for (int j = 0; j < sightings.size(); j++)
                    {
                        try
                        {
                            if (sightings.get(j) == sightings.get(j + 1))
                            {
                                mostSightings++;
                            }
                            else
                            {
                                continue;
                            }
                        }
                        catch (IndexOutOfBoundsException e)
                        {
                            if (sightings.get(j - 1) == sightings.get(j));
                        }
                        if (mostType > sightings.get(j));
                    }
                }
                if ((currentMostType > mostType) && (currentMostType != 0))
                {
                    mostType = currentMostType;
                    resetCounter = false;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
            if (i == (sightings.size() - 1))
            {
                System.out.println("Most type: " + mostType + "\n" + "Most sightings: " + mostSightings);
                System.out.println(sightings);
            }
        }
    }
}