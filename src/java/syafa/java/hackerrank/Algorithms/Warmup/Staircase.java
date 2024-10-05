package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class Staircase
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int staricaseSize = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = 0; i < staricaseSize; i++)
        {
            for (int j = staricaseSize; j > 0; j--)
            {
                System.out.print(' ');
            }
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print('#');
            }
        }
    }
}