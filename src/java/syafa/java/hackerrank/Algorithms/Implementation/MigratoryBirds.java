package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class MigratoryBirds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sightingAmount = Integer.parseInt(input.nextLine());
        int[] sighting = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Collections.reverse(Arrays.asList(sighting));
        int currentMode = 0;
        int currentMostType = 0;
        int mode = 0;
        int mostType = Integer.MAX_VALUE;
        for (int i = 0; i < sighting.length; i++)
        {
            currentMostType = sighting[i];
            if ((sighting[i] == sighting[i++]) && (currentMostType < mostType))
            {
                //
            }
        }
    }
}