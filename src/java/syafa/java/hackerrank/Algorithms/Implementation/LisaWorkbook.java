package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class LisaWorkbook
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] book = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] problem = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int currentPageProblem = 0;
        int currentChapter = 1;
        int currentPage = 1;
        int specialProblem = 0;
        for (int i = 1; i < book[0];)
        {
            try
            {
                if (currentPage == currentPageProblem)
                {
                    specialProblem++;
                }
                if (currentPageProblem < book[1])
                {
                    currentPageProblem++;
                }
                else if (currentPageProblem == book[1])
                {
                    currentPage++;
                    i++;
                }
                if (currentPageProblem == problem[i])
                {
                    currentChapter++;
                    currentPageProblem = 0;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
        System.out.print(specialProblem);
    }
}