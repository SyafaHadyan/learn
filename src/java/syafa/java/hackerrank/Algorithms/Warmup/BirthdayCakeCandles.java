package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class BirthdayCakeCandles
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       StringBuilder useless = new StringBuilder(input.nextLine());
       useless.delete(0,useless.length());
       ArrayList<String> inputCandleString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
       input.close();
       ArrayList<Double> inputCandleDouble = new ArrayList<Double>();
       ArrayList<Double> inputCandleDoubleReversed = new ArrayList<Double>();
       int highestMatch = 0;
       for (int i = 0; i < inputCandleString.size(); i++)
       {
            inputCandleDouble.add(Double.parseDouble(inputCandleString.get(i)));
       }
       Collections.sort(inputCandleDouble);
       for (int i = inputCandleDouble.size() - 1; i > 0; i--)
       {
            inputCandleDoubleReversed.add(inputCandleDouble.get(i));
       }
       for (int i = 0; i < inputCandleDouble.size(); i++)
       {
            // .getLast() isn't supported on HackerRank
            if (inputCandleDouble.get(i).equals(inputCandleDouble.get(i)))
            {
                highestMatch++;
            }
       }
       System.out.print(highestMatch);
    }
}