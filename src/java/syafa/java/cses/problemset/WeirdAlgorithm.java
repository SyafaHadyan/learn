package syafa.java.cses.problemset;
import java.util.*;

public class WeirdAlgorithm
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int initialNumber = Integer.parseInt(input.nextLine());
        input.close();
        System.out.print(initialNumber);
        for (int i = 0; initialNumber != 1; i++)
        {
            if (initialNumber % 2 != 0)
            {
                initialNumber = (initialNumber * 3) + 1;
            }
            else
            {
                initialNumber /= 2;
            }
            System.out.print(" " + initialNumber);
        }
        System.out.println();
    }
}