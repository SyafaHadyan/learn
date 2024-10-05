package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class Staircase
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int staricaseSize = Integer.parseInt(input.nextLine());
        int space = staricaseSize - 1;
        input.close();
        for (int i = 0; i < staricaseSize; i++)
        {
            for (int j = space; j > 0; j--)
            {
                System.out.print(' ');
            }
            space--;
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print('#');
            }
            if (i < staricaseSize)
            {
                System.out.print("\n");
            }
        }
    }
}