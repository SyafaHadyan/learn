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
        long result = (repeat /= stringInput.length()) * targetCharacterAmount;
        result += stringInput.substring(0,(int) remainingAdd).length();
        System.err.println("TC " + targetCharacterAmount);
        System.err.println("RP " + repeat);
        System.err.println("MD " + remainingAdd);
        System.err.println("LF " + stringInput);
        System.out.println(result);
    }
}