package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int result0 = 0;
        int result1 = 0;
        int result = 0;
        ArrayList<Integer> inputInteger = new ArrayList<Integer>();
        for (int i = 0; i < size; i++)
        {
            String[] inputArray = input.nextLine().split(" ");
            for (int j = 0; j < inputArray.length; j++)
            {
                inputInteger.add(Integer.parseInt(inputArray[j]));
            }
        }
        result0 = Math.abs(inputInteger.getFirst() + inputInteger.get((inputInteger.size() / 2)) + inputInteger.getLast());
        result1 = Math.abs(inputInteger.get(size - 1) + inputInteger.get((inputInteger.size() / 2)) + size * (size - 1));
        result  = Math.abs(result0 + result1);
        for (int i = 0; i < args.length; i++)
        {
            //
        }
        input.close();
        System.out.print(result0 + "\n" + result1 + "\n" + result);
    }
}