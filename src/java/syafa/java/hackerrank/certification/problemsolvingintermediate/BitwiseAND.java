package syafa.java.hackerrank.certification.problemsolvingintermediate;
import java.util.*;

public class BitwiseAND
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        int[] number = new int[numberAmount];
        int bitwiseAndCount = 0;
        for (int i = 0; i < number.length; i++)
        {
            number[i] = Integer.parseInt(input.nextLine());
        }
        input.close();
        for (int i = 0; i < number.length; i++)
        {
            for (int j = 1 + i; j < number.length; j++)
            {
                int numberAnd = number[i] & number[j];
                boolean powerOfTwo = true;
                while (numberAnd >= 1)
                {
                    try
                    {
                        numberAnd = Integer.parseInt(String.valueOf(Math.sqrt(numberAnd)));
                    }
                    catch (NumberFormatException e)
                    {
                        powerOfTwo = false;
                        break;
                    }
                }
                if (powerOfTwo || numberAnd == 1)
                {
                    bitwiseAndCount++;
                }
            }
        }
        System.out.println(bitwiseAndCount);
    }
}