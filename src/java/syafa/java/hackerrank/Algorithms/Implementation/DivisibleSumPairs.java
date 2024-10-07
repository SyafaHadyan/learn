package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class DivisibleSumPairs
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> initialValue = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> pairs = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        int divisiblePairs = 0;
        ArrayList<Integer> pairsResult = new ArrayList<Integer>();
        // TODO: Match must not a duplicate
        for (int i = 0; i < pairs.size(); i++)
        {
            for (int j = 0; j < pairs.size(); j++)
            {
                if ((Integer.parseInt(pairs.get(i)) + Integer.parseInt(pairs.get(j))) % Integer.parseInt(initialValue.get(1)) == 0)
                {
                    if (Integer.parseInt(pairs.get(i)) == (Integer.parseInt(pairs.get(j))))
                    {
                        continue;
                    }
                    divisiblePairs++;
                }
            }
        }
        System.out.print(divisiblePairs / 2);
    }
}