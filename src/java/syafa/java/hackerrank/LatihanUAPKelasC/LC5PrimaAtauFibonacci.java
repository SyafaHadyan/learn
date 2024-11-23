package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5PrimaAtauFibonacci
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        int[] numberSequence = new int[numberAmount];
        for (int i = 0; i < numberSequence.length; i++)
        {
            numberSequence[i] = input.nextInt();
        }
        input.close();
    }
    /*
     * Prime
     * Fibonacci
     * Arithmetic
     */
}