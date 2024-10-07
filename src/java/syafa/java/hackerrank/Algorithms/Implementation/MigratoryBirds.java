package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class MigratoryBirds
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        ArrayList<String> sightings = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<Integer> sightingsSorted = new ArrayList<Integer>();
        input.close();
        int mostSightings = 0;
        int mostType = 0;
        int increment = 1;
        for (int i = 0; i < sightings.size(); i++)
        {
            sightingsSorted.add(Integer.parseInt(sightings.get(i)));
        }
        Collections.sort(sightingsSorted);
        for (int i = 0; i < sightingsSorted.get(sightingsSorted.size() - 1); i+= increment)
        {
            increment = 1;
            for (int j = Integer.parseInt(sightings.get(i)); j < sightingsSorted.size(); j++)
            {
                
            }
            /*
            if ((Integer.parseInt(sightings.get(i)) > mostSightings) && (Integer.parseInt(sightings.get(i)) > mostType))
            {
                mostType = Integer.parseInt(sightings.get(i));
                mostSightings = Integer.parseInt(sightings.get(i));
            }
            if (Integer.parseInt(sightings.get(i)) > mostType)
            {
                mostType = Integer.parseInt(sightings.get(i));
            }
            for (int j = 0; j < args.length; j++)
            {
                
            }
            */
            for (int j = i; j < sightings.size(); j++)
            {
                if (j++ < sightingsSorted.get(j))
                {
                    increment++;
                }
            }
            System.out.println(i + " " + increment);
        }
    }
}