package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day10BinaryNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] binary = Integer.toString(Integer.parseInt(input.nextLine())).chars().map(Character::getNumericValue).toArray();
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
                    currentConsecutive = 0;
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
    }
}