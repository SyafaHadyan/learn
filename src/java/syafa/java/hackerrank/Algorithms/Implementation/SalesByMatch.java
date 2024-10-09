package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class SalesByMatch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int AmountOfSales = Integer.parseInt(input.nextLine());
        ArrayList<String> sales = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<Integer> salesSorted = new ArrayList<Integer>();
        input.close();
        for (int i = 0; i < sales.size(); i++)
        {
            salesSorted.add(Integer.parseInt(sales.get(i)));
        }
        Collections.sort(salesSorted);
        for (int i = 0; i < salesSorted.size(); i++)
        {
            if (salesSorted.get(i) == salesSorted.get(i + 1));
            {
                i++;
                continue;
            }

        }
    }
}