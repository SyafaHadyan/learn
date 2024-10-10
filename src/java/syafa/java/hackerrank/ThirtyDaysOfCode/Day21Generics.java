package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day21Generics
{
    private static void printArray()
    {
        Scanner input = new Scanner(System.in);
        int arrayIntegerLength = Integer.parseInt(input.nextLine());
        ArrayList<Integer> arrayInteger = new ArrayList<Integer>();
        ArrayList<String> arrayString = new ArrayList<String>();
        for (int i = 0; i < arrayIntegerLength; i++)
        {
            arrayInteger.add(Integer.parseInt(input.nextLine()));
        }
        int arrayStringLength = Integer.parseInt(input.nextLine());
        for (int i = 0; i < arrayStringLength; i++)
        {
            arrayString.add(input.nextLine());
        }
        for (int i = 0; i < arrayInteger.size() + arrayString.size(); i++)
        {
            if (i < arrayInteger.size())
            {
                System.out.print(arrayInteger.get(i));
            }
            else if (i >= arrayInteger.size())
            {
                System.out.print(arrayString.get(i));
            }
            if (i != arrayInteger.size() - 1)
            {
                System.out.print("\n");
            }
        }
        input.close();
        return;
    }
    public static void main(String[] args)
    {
        printArray();
    }
}