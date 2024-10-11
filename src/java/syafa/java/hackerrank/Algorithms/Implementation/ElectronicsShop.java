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
        int currentHigh = 0;
        for (int i = 0; i < keyboardPricesString.size(); i++)
        {
            keyboardPrices.add(Integer.parseInt(keyboardPricesString.get(i)));
        }
        for (int i = 0; i < usbPricesString.size(); i++)
        {
            usbPrices.add(Integer.parseInt(usbPricesString.get(i)));
        }
        Collections.sort(keyboardPrices);
        Collections.sort(usbPrices);
        for (int i = 0; i < keyboardPrices.size(); i++)
        {
            for (int j = 0; j < usbPrices.size(); j++)
            {
                if ((keyboardPrices.get(i) + usbPrices.get(j)) <= Integer.parseInt(budget.get(0)) && (keyboardPrices.get(i) + usbPrices.get(j)) > currentHigh)
                {
                    currentHigh = (keyboardPrices.get(i) + usbPrices.get(j));
                }
                if (i + j - keyboardPrices.size() - usbPrices.size() == 0)
                {
                    System.out.print(currentHigh);
                    return;
                }
            }
        }
    }
}