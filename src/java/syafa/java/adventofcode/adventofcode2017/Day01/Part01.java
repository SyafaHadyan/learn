package syafa.java.adventofcode.adventofcode2017.Day01;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] captchaDigit = Stream.of(input.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int validDigitSum = 0;
        for (int i = 0; i < captchaDigit.length; i += 2)
        {
            if (captchaDigit[i] == captchaDigit[i + 1])
            {
                validDigitSum++;`
            }
        }
    }
}