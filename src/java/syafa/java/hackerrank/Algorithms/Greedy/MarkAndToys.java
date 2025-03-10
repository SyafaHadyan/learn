package syafa.java.hackerrank.Algorithms.Greedy;
import java.util.*;
import java.util.stream.*;

public class MarkAndToys
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] budget = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] price = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(price);
        input.close();
        int toyCounter = 0;
        if (price[0] > budget[1])
        {
            System.out.print(0);
            return;
        }
        for (int i = 0; i < price.length; i++)
        {
            if (price[i] <= budget[1])
            {
                toyCounter++;
                budget[1] -= price[i];
            }
        }
        System.out.print(toyCounter);
    }
}