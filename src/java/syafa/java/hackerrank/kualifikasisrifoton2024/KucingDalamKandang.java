package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;
import java.util.stream.*;

public class KucingDalamKandang
{
    public static void main(String[] args)
    {
        /*
         * 3
         * 1 0 5
         * 
         * 4
         * 
         * sort
         * iterate 1
         * 0 1 5
         * 0 2 4
         * 
         * sort
         * iterate 2
         * 1 2 3
         * 
         * sort
         * iterate 3
         * 2 2 2
         */
        Scanner input = new Scanner(System.in);
        int cageAmount = Integer.parseInt(input.nextLine());
        int[] cage = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        while (true)
        {
            Arrays.sort(cage);
            for (int i = 0; i < cage.length; i++)
            {
                cage[cage[cage.length - 1] - 1];
                cage[cage[cage.length - 2]]
            }
        }
    }
}