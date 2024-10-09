package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class UtopianTree
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int AmountOfChecks = Integer.parseInt(input.nextLine());
        int treeHeight = 0;
        ArrayList<Integer> heightCheck = new ArrayList<Integer>();
        ArrayList<Integer> heightResult = new ArrayList<Integer>();
        for (int i = 0; i < AmountOfChecks; i++)
        {
            heightCheck.add(Integer.parseInt(input.nextLine()));
        }
        input.close();
        for (int i = 0; i < heightCheck.get(heightCheck.size() - 1); i++)
        {
            if ((i != 0) || (i % 2 != 0))
            {
                treeHeight *= 2;
            }
            else if ((i == 0) || (i % 2 == 0))
            {
                treeHeight++;
            }
            if (i == heightCheck.get(i))
            {
                heightResult.add(heightResult);
            }
        }
        for (int i = 0; i < heightResult.size(); i++)
        {
            System.out.print(heightResult.get(i));
            if (i < heightResult.size() - 1)
            {
                System.out.print("\n");
            }
        }
    }
}