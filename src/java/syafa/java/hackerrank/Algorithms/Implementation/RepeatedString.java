package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class RepeatedString
{
    static final String TARGET_CHARACTER = "a";
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String stringInput = input.nextLine();
        long repeat = Long.parseLong(input.nextLine());
        input.close();
        long targetCharacterAmount = stringInput.replaceAll("[^" + TARGET_CHARACTER + "]","").length();
        long remainingAdd = repeat % stringInput.length();
        long result = (stringInput.substring(0,(int) remainingAdd).replaceAll("[^" + TARGET_CHARACTER + "]","").length()) + ((repeat /= stringInput.length()) * targetCharacterAmount);
        System.out.println(result);
    }
}