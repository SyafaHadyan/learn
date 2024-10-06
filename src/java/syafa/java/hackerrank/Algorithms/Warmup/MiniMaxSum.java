package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class MiniMaxSum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> inputString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<Integer> inputInteger = new ArrayList<Integer>();
        int minSum = 0;
        int maxSum = 0;
        for (int i = 0; i < inputString.size(); i++)
        {
            inputInteger.add(Integer.parseInt(inputString.get(i)));
        }
        Collections.sort(inputInteger);
        for (int i = 0; i < inputInteger.size() - 1; i++)
        {
            minSum += inputInteger.get(i);
        }
    }
}