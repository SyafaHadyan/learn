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
                if ((Double.parseDouble(numberString.get(i)) - Double.parseDouble(numberString.get(i + 1))) < currentLowestDiffAbs)
            }
            catch (IndexOutOfBoundsException e)
            {
                // TODO: handle exception
            }
            numberInteger.add(Integer.parseInt(numberString.get(i)));
        }
        Collections.sort(numberInteger,Comparator.comparingInt(Math::abs));
    }
}