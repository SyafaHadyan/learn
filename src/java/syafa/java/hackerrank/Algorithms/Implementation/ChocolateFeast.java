package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class ChocolateFeast
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int[] chocolate = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int chocolateCounter = chocolate[0] / chocolate[1];
            int wrapperCounter = chocolateCounter;
            while (wrapperCounter >= chocolate[2])
            {
                wrapperCounter -= chocolate[2];
                chocolateCounter++;
                wrapperCounter++;
            }
            result[i] = chocolateCounter;
        }
        input.close();
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]);
            if (result.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}