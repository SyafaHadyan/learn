package syafa.java.hackerrank.uappemrogramandasar2023tifa;
import java.util.*;

public class RiffleShufflerString
{
    public static String[] splitString(String[] originalString)
    {
        String firstString = "";
        String secondString = "";
        for (int i = 0; i < (originalString.length / 2) + (originalString.length % 2); i++)
        {
            firstString = firstString.concat(originalString[i]);
        }
        for (int i = (originalString.length / 2) + (originalString.length % 2); i < originalString.length; i++)
        {
            secondString = secondString.concat(originalString[i]);
        }
        return new String[]{firstString,secondString};
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] inputString = input.nextLine().split("");
        input.close();
        String[] splitStringFirst = splitString(inputString);
        String[] splitStringLeftFirst = splitString(splitStringFirst[0].split(""));
        String[] splitStringLeftSecond = splitString(splitStringFirst[0].split(""));
    }
}