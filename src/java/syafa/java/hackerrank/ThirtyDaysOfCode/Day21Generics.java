package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day21Generics
{
    private static void printArray()
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        ArrayList<String> arrayString = new ArrayList<String>();
        for (int i = 0; i < arrayLength; i++)
        {
            arrayString.add(input.nextLine());
        }
        input.close();
        return;
    }
    public static void main(String[] args)
    {
        printArray();
    }
}