package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.*;
import java.math.*;

public class BigSorting
{
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
    }
}