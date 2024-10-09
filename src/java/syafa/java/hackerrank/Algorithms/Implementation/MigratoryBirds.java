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
        int mostSightings = 1;
        int mostType = 0;
        int currentMostType = 0;
        for (int i = 0; i < sightings.size(); i++)
        {
            sightingsSorted.add(Integer.parseInt(sightings.get(i)));
        }
        Collections.sort(sightingsSorted);
        for (int i = 0; i < sightingsSorted.size(); i++)
        {
            try
            {
                if ((sightingsSorted.get(i) == sightingsSorted.get(i + 1)) && (sightingsSorted.get(i) > mostType))
                {
                    mostSightings = 1;
                    currentMostType = sightingsSorted.get(i);
                    for (int j = 0; j < sightingsSorted.size(); j++)
                    {
                        try
                        {
                            if (sightingsSorted.get(j) == sightingsSorted.get(j + 1))
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
                            if (sightingsSorted.get(j - 1) == sightingsSorted.get(j));
                        }
                        if (mostType > sightingsSorted.get(j));
                    }
                }
                if ((currentMostType > mostType) && (currentMostType != 0))
                {
                    mostType = currentMostType;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
        System.out.println("Most type: " + mostType + "\n" + "Most sightings: " + mostSightings);
        System.out.println(sightingsSorted);
    }
}