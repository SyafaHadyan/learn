package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class DrawingBook
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int bookPage = Integer.parseInt(input.nextLine());
        int targetPage = Integer.parseInt(input.nextLine());
        input.close();
        int minimumPageTurn = 0;
        int section = 1;
        for (int i = 1; i < targetPage; i++)
        {
            if (section == 1)
            {
                minimumPageTurn++;
                section = 0;
                continue;
            }
            if (section == 0)
            {
                section++;
                continue;
            }
        }
        System.out.print(minimumPageTurn);
    }
}