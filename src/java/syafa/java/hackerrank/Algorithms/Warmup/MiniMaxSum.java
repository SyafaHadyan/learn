package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class MiniMaxSum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> inputString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        ArrayList<Double> inputDouble = new ArrayList<Double>();
        int minSum = 0;
        int maxSum = 0;
        for (int i = 0; i < inputString.size(); i++)
        {
            inputDouble.add(Double.parseDouble(inputString.get(i)));
        }
        Collections.sort(inputDouble);
        for (int i = 0; i < inputDouble.size() - 1; i++)
        {
            minSum += inputDouble.get(i);
        }
        for (int i = 1; i < inputDouble.size(); i++)
        {
            maxSum += inputDouble.get(i);
        }
        System.out.print(minSum + " " + maxSum);
    }
}