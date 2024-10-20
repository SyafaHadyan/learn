package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class LibraryFine
{
    public static void main(String[] args)
    {
        /*
         * [x]if same month and year, fine = (15 * days late)
         * [ ]if different month but same year, fine = (500 * months late)
         * [ ]if different year, fine = 10000
         */
        Scanner input = new Scanner(System.in);
        int[] bookReturn = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dueDate = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        if (bookReturn[0] <= dueDate[0] && bookReturn[1] <= dueDate[1] && bookReturn[2] <= dueDate[2])
        {
            System.out.print(0);
            return;
        }
        else if (bookReturn[0] > dueDate[0] && bookReturn[1] == dueDate[1] && bookReturn[2] == dueDate[2])
        {
            System.out.print((bookReturn[0] - dueDate[0]) * 15);
            return;
        }
    }
}