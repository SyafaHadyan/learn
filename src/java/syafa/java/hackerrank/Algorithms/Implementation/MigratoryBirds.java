package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class MigratoryBirds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //StringBuilder useless = new StringBuilder(input.nextLine());
        //useless.delete(0,useless.length());
        ArrayList<String> sightings = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<Integer> sightingsSorted = new ArrayList<Integer>();
        input.close();
        //StringBuilder mostSightingsStrbuilder = new StringBuilder("0");
        /*
         * TODO: mostSightings must be lowest type of most seen bird
         */
        boolean resetCounter = true;
        int mostType = 0;
        int currentMostType = 0;
        int mostSightings = 1;
        for (int i = 0; i < sightings.size(); i++)
        {
            sightingsSorted.add(Integer.parseInt(sightings.get(i)));
        }
        Collections.sort(sightingsSorted);
        for (int i = 0; i < sightingsSorted.size(); i++)
        {
            if (resetCounter)
            {
                mostSightings = 1;
            }
            try
            {
                if ((sightingsSorted.get(i) == sightingsSorted.get(i + 1)))
                {
                    if ((sightingsSorted.get(i) > currentMostType) && (currentMostType == 0))
                    {
                        currentMostType = sightingsSorted.get(i);
                    }
                    for (int j = 0; j < sightingsSorted.size(); j++)
                    {
                        try
                        {
                            if (sightingsSorted.get(i) == sightingsSorted.get(i + 1))
                            {
                                mostSightings++;
                                resetCounter = false;
                            }
                            else
                            {
                                resetCounter = true;
                                if (mostSightings > currentMostType)
                                {
                                    mostType = sightingsSorted.get(i);
                                    currentMostType = mostSightings;
                                }
                                else if ((mostSightings == currentMostType) && (sightingsSorted.get(i) < mostType))
                                {
                                    mostType = sightingsSorted.get(i);
                                }
                            }
                        }
                        catch (IndexOutOfBoundsException e)
                        {
                            if (sightingsSorted.get(j - 1) == sightingsSorted.get(j));
                        }
                        if (mostType > sightingsSorted.get(j));
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
            if (i == (sightingsSorted.size() - 1))
            {
                System.out.println("Most type: " + mostType + "\n" + "Most sightings: " + mostSightings);
                System.out.println(sightingsSorted);
            }
        }
    }
}