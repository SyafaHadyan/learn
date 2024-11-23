package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class SequenceEquation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sequenceAmount = Integer.parseInt(input.nextLine());
        int[] sequence = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
        for (int i = 1; i <= sequenceAmount; i++)
        {
            for (int j = -1 + i; j < sequenceAmount; j++)
            {
                if (sequence[sequence[j]] == i)
                {
                    System.err.println("i " + i + "\n" + "j " + j);
                    System.out.println(j);
                }
            }
        }
    }
}