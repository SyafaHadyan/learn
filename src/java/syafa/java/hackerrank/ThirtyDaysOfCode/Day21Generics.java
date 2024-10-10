package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day21Generics
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        ArrayList<String> arrayString = new ArrayList<String>();
        for (int i = 0; i < arrayLength; i++)
        {
            arrayString.add(input.nextLine());
        }
        input.close();
    }
}