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
        for (int i = 0; i < sightingsSorted.size(); i+= increment)
        {
            if ((sightingsSorted.get(i) == sightingsSorted.get(i + 1)) && (sightingsSorted.get(i) > mostType))
            {

            }
        }
    }
}