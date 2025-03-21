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
    public static String shuffleString(String firstStringRaw,String secondStringRaw)
    {
        String[] firstString = firstStringRaw.split("");
        String[] secondString = secondStringRaw.split("");
        String result = "";
        if (firstString.length == secondString.length)
        {
            for (int i = 0; i < firstString.length; i++)
            {
                result = result.concat(firstString[i]);
                result = result.concat(secondString[i]);
            }
        }
        else
        {
            for (int i = 0; i < secondString.length; i++)
            {
                result = result.concat(firstString[0]);
                result = result.concat(secondString[i]);
            }
            result = result.concat(firstString[firstString.length - 1]);
        }
        System.err.println(result);
        return result;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] inputString = input.nextLine().split("");
        input.close();
        String[] splitStringFirst = splitString(inputString);
        String[] splitStringLeft = splitString(splitStringFirst[0].split(""));
        String[] splitStringRight = splitString(splitStringFirst[1].split(""));
        String[] stringSplitFinalFirst = new String[4];
        int index = 0;
        for (int i = 0; i < splitStringLeft.length; i++)
        {
            stringSplitFinalFirst[index] = splitStringLeft[i];
            index++;
        }
        for (int i = 0; i < splitStringRight.length; i++)
        {
            stringSplitFinalFirst[index] = splitStringRight[i];
            index++;
        }
        System.err.println(Arrays.toString(stringSplitFinalFirst));
        String[] stringSplitFinalFinal = {shuffleString(stringSplitFinalFirst[0],stringSplitFinalFirst[1]),shuffleString(stringSplitFinalFirst[2],stringSplitFinalFirst[3])};
        System.err.println(Arrays.toString(stringSplitFinalFinal));
        System.out.println(shuffleString(stringSplitFinalFinal[0],stringSplitFinalFinal[1]));
    }
}