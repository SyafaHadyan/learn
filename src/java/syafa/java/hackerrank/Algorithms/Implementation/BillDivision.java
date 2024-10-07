package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class BillDivision
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> itemPrices = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        int charge = Integer.parseInt(input.nextLine());
        String bonAppetit = "Bon Appetit";
        input.close();
        int totalPrice = 0;
        for (int i = 0; i < itemPrices.size(); i++)
        {
            if (i != Integer.parseInt(items.get(1)))
            {
                continue;
            }
            totalPrice += Integer.parseInt(itemPrices.get(i));
        }
        totalPrice = totalPrice / 2;
    }
}