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
        String[] splitStringLeft = splitString(splitStringFirst[0].split(""));
        String[] splitStringRight = splitString(splitStringFirst[1].split(""));
        String[] stringSplitFinal = new String[4];
        int index = 0;
        for (int i = 0; i < splitStringLeft.length; i++)
        {
            stringSplitFinal[index] = splitStringLeft[i];
            index++;
        }
        for (int i = 0; i < splitStringRight.length; i++)
        {
            stringSplitFinal[index] = splitStringRight[i];
            index++;
        }
        System.out.println(Arrays.toString(stringSplitFinal));
    }
}