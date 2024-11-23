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
        int[] sortedSequence = Arrays.copyOf(sequence,sequenceAmount);
        Arrays.sort(sortedSequence);
        for (int i = 0; i < sequenceAmount; i++)
        {
            for (int j = 0; j < sequenceAmount; j++)
            {
                
            }
        }
    }
}