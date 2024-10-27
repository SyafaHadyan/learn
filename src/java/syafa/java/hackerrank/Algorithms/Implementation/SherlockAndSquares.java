package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class SherlockAndSquares
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int minNumber = Integer.parseInt(input.nextLine());
        int maxNumber = Integer.parseInt(input.nextLine());
        input.close();
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int counter = 0;
            for (int j = minNumber; j <= maxNumber; j++)
            {
                if (Math.sqrt(j) == Math.floor(Math.sqrt(j)))
                {
                    counter++;
                }
            }
            result[i] = counter;
        }
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]);
            if (result.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}