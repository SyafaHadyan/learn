package syafa.java.hackerrank.Algorithms.Greedy;
import java.util.*;

public class MinimumAbsoluteDifferenceInAnArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double currentLowestDiffAbs = Double.parseDouble(input.nextLine());
        ArrayList<String> numberString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        ArrayList<Double> numberDouble = new ArrayList<Double>();
        currentLowestDiffAbs = 0d;
        for (int i = 0; i < numberString.size(); i++)
        {
            numberDouble.add(Double.parseDouble(numberString.get(i)));
            if (i == numberString.size() - 1)
            {
                Collections.sort(numberDouble,Comparator.comparingDouble(Math::abs));
            }
        }
        for (int i = 0; i < numberString.size(); i++)
        {
            try
            {
                if ((Math.abs(Double.parseDouble(numberString.get(i)) - Double.parseDouble(numberString.get(i + 1))) < currentLowestDiffAbs) && (i != 0))
                {
                    currentLowestDiffAbs = Math.abs(Double.parseDouble(numberString.get(i)) - Double.parseDouble(numberString.get(i + 1)));
                }
                else if (i == 0)
                {
                    currentLowestDiffAbs = Math.abs(Double.parseDouble(numberString.get(i)) - Double.parseDouble(numberString.get(i + 1)));
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.printf("%.0f",currentLowestDiffAbs);
            }
        }
    }
}