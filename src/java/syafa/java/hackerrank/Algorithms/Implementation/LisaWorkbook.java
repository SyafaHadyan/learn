package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class LisaWorkbook
{
    public static void main(String[] args)
    {
        /*
         * STDIN       Function
         * -----       --------
         * 5 3         n = 5, k = 3
         * 4 2 6 1 10  arr = [4, 2, 6, 1, 10]
         * 
         * 5 3
         * 
         * 4 2 6 1 10
         * 
         * 4
         * 
         * chapter = 5
         * maximumProblem = 3;
         * 
         * chapter 1 = 4
         * chapter 2 = 2
         * chapter 3 = 6
         * chapter 4 = 1
         * chapter 5 = 10
         * 
         *                              x (page match with problem number)
         * page 1: chapter 1: problems: 1, 2, 3 page++ specialProblem++
         * 
         * 
         * page 2: chapter 1: problems: 4 page++ chapter++
         * 
         * 
         * page 3: chapter 2: problems: 1 2 page++ chapter++
         * 
         * 
         * page 4: chapter 3: problems: 1 2 3 page++
         * 
         *                                x (page match with problem number)
         * page 5: chapter 3: problems: 4 5 6 page++ chapter++ specialProblem++
         * 
         * 
         * page 6: chapter 4: problems: 1 page++ chapter++
         * 
         * 
         * page 7: chapter 5: problems: 1 2 3 page++
         * 
         * 
         * page 8: chapter 5: problems: 4 5 6 page++
         * 
         *                                  x (page match with problem number)
         * page 9: chapter 5: problmes: 7 8 9 page++ specialproblem++
         * 
         *                               x (page match with problem number)
         * page 10: chapter 5: problems: 10 end of page, end of chapter
         * 
         */
        Scanner input = new Scanner(System.in);
        int[] book = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] problem = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        while (true)
        {
            for (int i = 1; i <= book[1]; i++)
            {
                //
            }
        }
    }
}