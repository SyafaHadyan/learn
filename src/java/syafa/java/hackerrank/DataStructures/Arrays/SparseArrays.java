package syafa.java.hackerrank.DataStructures.Arrays;
import java.util.*;

public class SparseArrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataAmount = Integer.parseInt(input.nextLine());
        int search = 0;
        String[] data = new String[dataAmount];
        for (int i = 0; i < dataAmount; i++)
        {
            data[i] = input.nextLine();
        }
        search = Integer.parseInt(input.nextLine());
        int[] occurence = new int[search];
        for (int i = 0; i < search; i++)
        {
            String tempSearch = input.nextLine();
            for (int j = 0; j < data.length; j++)
            {
                if (data[j].equalsIgnoreCase(tempSearch))
                {
                    occurence[i]++;
                }
            }
        }
        input.close();
        for (int i = 0; i < occurence.length; i++)
        {
            System.out.print(occurence[i]);
            if (occurence.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}