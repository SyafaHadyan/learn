package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class SalesByMatch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int AmountOfSales = Integer.parseInt(input.nextLine());
        ArrayList<String> sales = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        ArrayList<Integer> salesSorted = new ArrayList<Integer>();
        int pairsWithoutMatch = 0;
        for (int i = 0; i < sales.size(); i++)
        {
            salesSorted.add(Integer.parseInt(sales.get(i)));
        }
        Collections.sort(salesSorted);
        for (int i = 0; i < salesSorted.size(); i++)
        {
            System.out.println(salesSorted);
            try
            {
                if (salesSorted.get(i) == salesSorted.get(i + 1))
                {
                    salesSorted.remove(0);
                    salesSorted.remove(0);
                    i--;
                    continue;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                pairsWithoutMatch++;
            }
            try
            {
                salesSorted.remove(0);
                salesSorted.remove(0);
            }
            catch (IndexOutOfBoundsException e)
            {
                pairsWithoutMatch++;
                break;
            }
            i--;
            pairsWithoutMatch++;
        }
        System.out.print(pairsWithoutMatch);
    }
}