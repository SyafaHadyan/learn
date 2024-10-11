package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class ElectronicsShop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> budget = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> keyboardPricesString = new ArrayList<String>(Arrays.asList((input.nextLine().split(" "))));
        ArrayList<String> usbPricesString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        ArrayList<Integer> keyboardPrices = new ArrayList<Integer>();
        ArrayList<Integer> usbPrices = new ArrayList<Integer>();
        for (int i = 0; i < keyboardPricesString.size(); i++)
        {
            keyboardPrices.add(Integer.parseInt(keyboardPricesString.get(i)));
        }
    }
}