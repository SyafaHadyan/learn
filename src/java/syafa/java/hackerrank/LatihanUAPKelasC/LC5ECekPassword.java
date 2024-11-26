package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5ECekPassword
{
    static final int MIN_CHARACTER_LENGTH = 8;
    static final int MIN_CAPITAL_CHARACTER = 1;
    static final int MIN_DIGIT = 2;
    static final int MIN_SPECIAL_CHARACTER = 1;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while (true)
        {
            String[] tempInput = input.nextLine().split("");
            int characterLength = 0;
            int capitalCharacterCount = 0;
            int digitCount = tempInput.length;
            int specialCharacterCount = 0;
            for (int i = 0; i < tempInput.length; i++)
            {
                characterLength++;
                try
                {
                    Integer.parseInt(tempInput[i]);
                }
                catch (NumberFormatException e)
                {
                    digitCount--;
                }
                if (tempInput[i].toUpperCase().equals(tempInput[i]))
                {
                    capitalCharacterCount++;
                    continue;
                }
                if (tempInput[i].toUpperCase().equals(tempInput[i].toLowerCase()))
                {
                    specialCharacterCount++;
                    continue;
                }
            }
        }
        input.close();
    }
}