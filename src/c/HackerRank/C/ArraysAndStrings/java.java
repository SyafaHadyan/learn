package c.HackerRank.C.ArraysAndStrings;
import java.util.*;

public class java
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] inputString = input.nextLine().split(" ");
        input.close();
        for (int i = 0; i < inputString.length; i++)
        {
            System.out.print(inputString[i]);
            if (inputString.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}