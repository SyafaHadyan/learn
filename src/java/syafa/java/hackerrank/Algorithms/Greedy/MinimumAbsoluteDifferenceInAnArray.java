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
                        if (((Math.abs(numberDouble.get(j + 1) - numberDouble.get(j))) < currentLowestDiffAbs) && (j != 0))
                        {
                            currentLowestDiffAbs = Math.abs(numberDouble.get(j + 1) - numberDouble.get(j));
                            if (currentLowestDiffAbs == 0)
                            {
                                numberDouble.get(numberDouble.size());
                            }
                        }
                        if (j == 0)
                        {
                            currentLowestDiffAbs = Math.abs(numberDouble.get(j + 1) - numberDouble.get(j));
                        }
                        if (Math.abs(numberDouble.get(j + 1)) == Math.abs(numberDouble.get(j)))
                        {
                            currentLowestDiffAbs = 0;
                            numberDouble.get(numberDouble.size());
                        }
                    }
                    catch (IndexOutOfBoundsException e)
                    {
                        System.out.printf("%.0f",currentLowestDiffAbs);
                        return;
                    }
                }
            }
        }
    }
}