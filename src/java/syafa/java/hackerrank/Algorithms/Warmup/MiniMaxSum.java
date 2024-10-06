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
        double minSum = 0d;
        double maxSum = 0d;
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
        System.out.printf("%.0f%s%.0f",minSum," ",maxSum);
    }
}