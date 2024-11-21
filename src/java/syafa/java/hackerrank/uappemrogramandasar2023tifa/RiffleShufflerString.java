package syafa.java.hackerrank.uappemrogramandasar2023tifa;
import java.util.*;

public class RiffleShufflerString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] inputString = input.nextLine().split("");
        input.close();
        String firstString = "";
        String secondString = "";
        String firstStringFirst = "";
        String secondStringFirst = "";
        String firstStringSecond = "";
        String secondStringSecond = "";
        for (int i = 0; i < (inputString.length / 2) + (inputString.length % 2); i++)
        {
            firstString = firstString.concat(inputString[i]);
        }
        for (int i = (inputString.length / 2) + (inputString.length % 2); i < inputString.length; i++)
        {
            secondString = secondString.concat(inputString[i]);
        }
        System.out.println(firstString + "\n" + secondString);
        for (int i = 0; i < (firstString.length() / 2) + (firstString.length() % 2); i++)
        {
            firstStringFirst = firstStringFirst.concat(String.valueOf(firstString.charAt(i)));
        }
        for (int i = (firstString.length() / 2) + (firstString.length() % 2); i < firstString.length(); i++)
        {
            secondStringFirst = secondStringFirst.concat(String.valueOf(firstString.charAt(i)));
        }
        System.out.println(firstStringFirst + "\n" + secondStringFirst);
    }
}