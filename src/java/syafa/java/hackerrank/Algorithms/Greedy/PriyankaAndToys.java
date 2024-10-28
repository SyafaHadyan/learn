package syafa.java.hackerrank.Algorithms.Greedy;
import java.util.*;
import java.util.stream.*;

public class PriyankaAndToys
{
    public static void main(String[] args)
    {
        /*
         * 8
         * 1 2 3 21 7 12 14 21
         * 
         * 4
         * 
         * Container 1 (1 2 3)  Range 1     5
         * Container 2 (21 21)  Range 21    25
         * Container 3 (7)      Range 7     11
         * Container 4 (12 14)  Range 12    14
         */
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[] toy = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}