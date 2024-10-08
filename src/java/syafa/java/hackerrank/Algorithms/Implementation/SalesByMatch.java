package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class SalesByMatch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        ArrayList<String> sales = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        ArrayList<Integer> salesSorted = new ArrayList<Integer>();
        int pairsMatch = 0;
        for (int i = 0; i < sales.size(); i++)
        {
            salesSorted.add(Integer.parseInt(sales.get(i)));
        }
        Collections.sort(salesSorted);
        for (int i = 0; i < salesSorted.size(); i++)
        {
            try
            {
                if (salesSorted.get(i) == salesSorted.get(i + 1))
                {
                    salesSorted.remove(0);
                    salesSorted.remove(0);
                    i--;
                    pairsMatch++;
                    continue;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
        System.out.print(pairsMatch);
    }
}