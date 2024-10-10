package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class BigSorting
{
    // TODO: Optimize the code
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        BigInteger[] numbers = new BigInteger[arraySize];
        for (int i = 0; i < arraySize; i++)
        {
            numbers[i] = input.nextBigInteger();
        }
        input.close();
        Arrays.sort(numbers);
        for (int i = 0; i < arraySize; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}