package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class SherlockAndSquares
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        input.close();
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int[] number = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int counter = 0;
            for (int j = number[0]; j <= number[1]; j++)
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