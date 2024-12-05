package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class RepeatedString
{
    static final String TARGET_CHARACTER = "a";
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String stringInput = input.nextLine();
        long targetCharacterAmount = stringInput.replaceAll("[^" + TARGET_CHARACTER + "]","").length();
        long repeat = Long.parseLong(input.nextLine());
        long remainingAdd = repeat % stringInput.length();
        repeat /= stringInput.length();
        input.close();
        stringInput = stringInput.substring(0,(int) remainingAdd);
        System.err.println("TC " + targetCharacterAmount);
        System.err.println("RP " + repeat);
        System.err.println("MD " + remainingAdd);
        System.err.println(stringInput);
        System.out.println((repeat) * targetCharacterAmount);
    }
}