package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class ServiceLane
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] highwayCar = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] servieLane = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[highwayCar[1]];
        for (int i = 0; i < highwayCar[1]; i++)
        {
            int[] temp = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] checkLane = new int[(temp[1] - temp[0]) + 1];
            for (int j = 0; j <= (temp[1] - temp[0]); j++)
            {
                checkLane[j] = servieLane[temp[0] + j];
            }
            Arrays.sort(checkLane);
            result[i] = checkLane[0];
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