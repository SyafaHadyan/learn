package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class UtopianTree
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int AmountOfChecks = Integer.parseInt(input.nextLine());
        int treeHeight = 0;
        int currentHeight = 0;
        ArrayList<Integer> heightResult = new ArrayList<Integer>();
        for (int i = 0; i < AmountOfChecks; i++)
        {
            if (i == 0 || i % 2 != 0)
            {
                treeHeight++;
            }
        }
        input.close();
    }
}