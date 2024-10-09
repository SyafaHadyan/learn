package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class UtopianTree
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int AmountOfChecks = Integer.parseInt(input.nextLine());
        int treeHeight = 0;
        int currentCheck = 0;
        ArrayList<Integer> heightCheck = new ArrayList<Integer>();
        ArrayList<Integer> heightResult = new ArrayList<Integer>();
        ArrayList<Integer> heightOutput = new ArrayList<Integer>();
        for (int i = 0; i < AmountOfChecks; i++)
        {
            heightCheck.add(Integer.parseInt(input.nextLine()));
        }
        input.close();
        for (int i = 0; i <= 60; i++)
        {
            if (i % 2 != 0)
            {
                treeHeight *= 2;
            }
            else if ((i == 0) || (i % 2 == 0))
            {
                treeHeight++;
            }
            heightResult.add(treeHeight);
        }
        for (int i = 0; i < heightCheck.size(); i++)
        {
            currentCheck = heightCheck.get(i);
            heightOutput.add(heightCheck.get(heightCheck.get(i)));
            if (i < heightCheck.size() - 1)
            {
                System.out.print("\n");
            }
        }
    }
}