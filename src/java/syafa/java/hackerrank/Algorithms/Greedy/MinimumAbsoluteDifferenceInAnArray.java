package syafa.java.hackerrank.Algorithms.Greedy;
import java.util.*;

public class MinimumAbsoluteDifferenceInAnArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        ArrayList<String> numberString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        double currentLowestDiffAbs = 0d;
        ArrayList<Integer> numberInteger = new ArrayList<Integer>();
        for (int i = 0; i < numberString.size(); i++)
        {
            try
            {
                if ((Math.abs(Double.parseDouble(numberString.get(i)) - Double.parseDouble(numberString.get(i + 1))) < currentLowestDiffAbs) && (i != 0))
                {
                    //
                }
                else if (i == 0)
                {
                    currentLowestDiffAbs = Math.abs(Double.parseDouble(numberString.get(i)) - Double.parseDouble(numberString.get(i + 1)));
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                break;
            }
            numberInteger.add(Integer.parseInt(numberString.get(i)));
        }
        Collections.sort(numberInteger,Comparator.comparingInt(Math::abs));
    }
}