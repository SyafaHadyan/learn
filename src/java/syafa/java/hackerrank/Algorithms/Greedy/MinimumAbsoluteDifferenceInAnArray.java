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
                for (int j = 0; j < numberString.size(); j++)
                {
                    try
                    {
                        if (((Math.abs(numberDouble.get(j) - numberDouble.get(j + 1))) < currentLowestDiffAbs) && (j != 0))
                        {
                            currentLowestDiffAbs = Math.abs(numberDouble.get(j) - numberDouble.get(j + 1));
                            if (currentLowestDiffAbs == 0)
                            {
                                numberDouble.get(numberDouble.size());
                            }
                            continue;
                        }
                        else if (j == 0)
                        {
                            currentLowestDiffAbs = Math.abs(Double.parseDouble(numberString.get(j)) - Double.parseDouble(numberString.get(j + 1)));
                        }
                    }
                    catch (IndexOutOfBoundsException e)
                    {
                        System.out.printf("%.0f",currentLowestDiffAbs);
                    }
                }
            }
        }
    }
}