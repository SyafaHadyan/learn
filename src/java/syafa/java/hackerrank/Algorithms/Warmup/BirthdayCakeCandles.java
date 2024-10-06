package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class BirthdayCakeCandles
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       ArrayList<String> inputCandleString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
       input.close();
       ArrayList<Double> inputCandleDouble = new ArrayList<Double>();
       int highestMatch = 0;
       for (int i = 0; i < inputCandleString.size(); i++)
       {
            inputCandleDouble.add(Double.parseDouble(inputCandleString.get(i)));
       }
       Collections.sort(inputCandleDouble);
       inputCandleString.clear();
       for (int i = 0; i < inputCandleDouble.size(); i++)
       {
            inputCandleString.add(String.valueOf(inputCandleDouble.get(i)));
       }
       for (int i = 0; i < inputCandleDouble.size(); i++)
       {
            //Integer.parseInt(inputCandleString.get(i)) == Integer.parseInt(inputCandleString.get(inputCandleString.size()))
            if (inputCandleDouble.get(i) == inputCandleDouble.getLast())
            {
                highestMatch++;
            }
       }
       for (int i = 0; i < inputCandleDouble.size(); i++)
       {
            System.out.print(inputCandleDouble.get(i));
            if (i < inputCandleDouble.size())
            {
                System.out.print(' ');
            }
       }
       System.out.print("\n");
       System.out.print(highestMatch);
    }
}