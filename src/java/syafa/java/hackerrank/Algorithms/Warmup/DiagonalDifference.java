package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
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
        result = inputInteger.get(0) + inputInteger.get(inputInteger.size() / 2);
        for (int i = 0; i < args.length; i++)
        {
            //
        }
        input.close();
        for (int i = 0; i < inputInteger.size(); i++)
        {
            System.out.println(inputInteger.get(i));
            /*
            if ((i < inputInteger.size()) && (i % size - 1 != 0))
            {
                System.out.print(" ");
            }
            */
        }
    }
}