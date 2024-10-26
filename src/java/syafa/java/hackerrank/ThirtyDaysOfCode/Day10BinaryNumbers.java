package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day10BinaryNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String binaryString = Integer.toBinaryString(Integer.parseInt(input.nextLine()));
        int[] binary = new int[binaryString.length()];
        for (int i = 0; i < binary.length; i++)
        {
            binary[i] = binaryString.charAt(i);
        }
        input.close();
        int consecutive = 0;
        int currentConsecutive = 1;
        for (int i = 0; i < binary.length; i++)
        {
            try
            {
                if (binary[i - 1] == 1 && binary[i] == 1)
                {
                    currentConsecutive++;
                }
                if (binary[i] == 0)
                {
                    currentConsecutive = 1;
                }
                if (currentConsecutive > consecutive)
                {
                    consecutive = currentConsecutive;
                }
            }
            catch (Exception e)
            {
                currentConsecutive++;
            }
        }
        System.out.print(consecutive);
    }
}