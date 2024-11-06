package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class NonDivisibleSubset
{
    public static void main(String[] args)
    {
        /*
         * STDIN    Function
         * -----    --------
         * 4 3      S[] size n = 4, k = 3
         * 1 7 2 4  S = [1, 7, 2, 4]
         * 
         * 3
         * 
         * 4 3
         * 1 7 2 4
         */
        Scanner input = new Scanner(System.in);
        int[] config = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int[] data = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
        HashMap<Integer,Integer> nonDivisibleSet = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < config[0]; i++)
        {
            for (int j = 1 + i; j < config[0]; j++)
            {
                if ((data[i] + data[j]) % config[1] != 0)
                {
                    nonDivisibleSet.putIfAbsent(data[i],data[j]);
                    counter++;
                }
                else if ((data[i] + data[j]) % config[1] == 0)
                {
                    System.out.println(nonDivisibleSet);
                    if (nonDivisibleSet.get(data[i]) != null && nonDivisibleSet.get(data[i]) == data[j])
                    {
                        counter--;
                    }
                    System.out.println(nonDivisibleSet);
                    System.out.println("debug");
                }
            }
        }
        System.out.println(nonDivisibleSet);
        System.out.println(counter);
    }
}