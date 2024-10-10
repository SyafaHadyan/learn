package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day21Generics
{
    private static void printArray()
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        ArrayList<Integer> arrayString = new ArrayList<Integer>();
        for (int i = 0; i < arrayLength; i++)
        {
            arrayString.add(Integer.parseInt(input.nextLine()));
        }
        for (int i = 0; i < arrayString.size(); i++)
        {
            System.out.print(arrayString.get(i));
            if (i != arrayString.size() - 1)
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