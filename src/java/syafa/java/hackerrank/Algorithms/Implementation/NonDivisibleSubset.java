package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class NonDivisibleSubset
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] config = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int[] data = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
        HashMap<Integer,Boolean> nonDivisibleSet = new HashMap<>();
        for (int i = 0; i < config[0]; i++)
        {
            for (int j = 1 + i; j < config[0]; j++)
            {
                if (data[i] + data[j] % config[1] != 0)
                {
                    nonDivisibleSet.putIfAbsent(data[i],true);
                    nonDivisibleSet.putIfAbsent(data[j],true);
                }
            }
        }
    }
}