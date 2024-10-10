package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.*;
import java.math.*;

public class BigSorting
{
    // TODO: Optimize the code
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        ArrayList<BigInteger> numbers = new ArrayList<>();
        for (int i = 0; i < arraySize; i++)
        {
            numbers.add(input.nextBigInteger());
        }
        input.close();
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print(numbers.get(i));
            if (i != numbers.size() - 1)
            {
                System.out.print("\n");
            }
        }
    }
}