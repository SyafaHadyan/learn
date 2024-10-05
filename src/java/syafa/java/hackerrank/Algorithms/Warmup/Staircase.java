package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class Staircase
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int staricaseSize = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = staricaseSize - 1; i > 0; i--)
        {
            System.out.print(' ');
        }
    }
}