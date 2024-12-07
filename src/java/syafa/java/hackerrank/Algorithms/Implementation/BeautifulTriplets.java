package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class BeautifulTriplets
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] config = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int[] array = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int tripletCounter = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 1 + i; j < array.length; j++)
            {
                if (array[j] - array[i] == config[1])
                {
                    for (int k = 1 + j; k < array.length; k++)
                    {
                        if (array[k] - array[j] == config[1])
                        {
                            System.err.println(i + " " + j + " " + k);
                            tripletCounter++;
                        }
                    }
                }
            }
        }
        System.out.println(tripletCounter);
    }
}