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
       for (int i = 0; i < inputCandleString.size(); i++)
       {
            inputCandleDouble.add(Double.parseDouble(inputCandleString.get(i)));
       }
       Collections.sort(inputCandleDouble);
       inputCandleString.clear();
       if (inputCandleDouble.contains(Integer.parseInt(inputCandleDouble.get(inputCandleDouble.size()))));
    }
}