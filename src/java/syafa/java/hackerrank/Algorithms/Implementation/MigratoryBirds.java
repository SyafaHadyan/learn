package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class MigratoryBirds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        int[] sighting = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(sighting);
        int currentMode = 1;
        int currentType = 0;
        int mode = 1;
        int mostType = Integer.MAX_VALUE;
        for (int i = sighting.length - 1; i >= 0; i--)
        {
            try
            {
                currentType = sighting[i];
                if (currentType == sighting[i + 1])
                {
                    currentMode++;
                }
                if (currentMode >= mode)
                {
                    mode = currentMode;
                    if (currentType != sighting[i - 1])
                    {
                        currentMode = 1;
                    }
                    if (currentType < mostType)
                    {
                        mostType = currentType;
                    }
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                if (i == sighting.length - 1)
                {
                    mostType = sighting[sighting.length - 1];
                }
            }
        }
        System.out.print(mostType);
    }
}