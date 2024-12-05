package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class RepeatedString
{
    static final String TARGET_CHARACTER = "a";
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String stringInput = input.nextLine();
        int targetCharacterAmount = stringInput.replaceAll("[^" + TARGET_CHARACTER + "]","").length();
        long repeat = Long.parseLong(input.nextLine());
        repeat /= stringInput.length();
        input.close();
        System.err.println("TC " + targetCharacterAmount);
        System.err.println("RP " + repeat);
        System.out.println((repeat) * targetCharacterAmount);
    }
}