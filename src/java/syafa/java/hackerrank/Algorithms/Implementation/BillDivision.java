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
    }
}