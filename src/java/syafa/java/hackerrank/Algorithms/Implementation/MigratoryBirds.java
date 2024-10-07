package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class MigratoryBirds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        ArrayList<String> sightings = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        int mostSightings = 0;
        int mostType = 0;
        for (int i = 0; i < sightings.size(); i++)
        {
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
        }
    }
}