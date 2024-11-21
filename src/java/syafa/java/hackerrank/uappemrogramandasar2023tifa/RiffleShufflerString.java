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
        for (int i = 0; i < (inputString.length / 2) + (inputString.length % 2); i++)
        {
            firstString = firstString.concat(inputString[i]);
        }
    }
}