package syafa.java.hackerrank.certification.problemsolvingintermediate;
import java.util.*;

public class BitwiseAND
{
    private static boolean isPowerOfTwo(int number)
    {
        if (number == 1)
        {
            return true;
        }
        while (number % 2 == 0 && number > 0)
        {
            number /= 2;
            if (number == 1)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        int bitwiseCounter = 0;
        int[] data = new int[arrayLength];
        for (int i = 0; i < data.length; i++)
        {
            data[i] = Integer.parseInt(input.nextLine());
        }
        input.close();
        for (int i = 0; i < data.length; i++)
        {
            for (int j = 1 + i; j < data.length; j++)
            {
                if (isPowerOfTwo(data[i] & data[j]))
                {
                    bitwiseCounter++;
                }
            }
        }
        System.out.println(bitwiseCounter);
    }
}