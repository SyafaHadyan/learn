package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class ElectronicsShop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> budget = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> keyboardPrices = new ArrayList<String>(Arrays.asList((input.nextLine().split(" "))));
        ArrayList<String> usbPrices = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        int currentHigh = 0;
        for (int i = 0; i < keyboardPrices.size(); i++)
        {
            for (int j = 0; j < usbPrices.size(); j++)
            {
                if ((Integer.parseInt(keyboardPrices.get(i)) + Integer.parseInt(usbPrices.get(j))) <= Integer.parseInt(budget.get(0)) && (Integer.parseInt(keyboardPrices.get(i)) + Integer.parseInt(usbPrices.get(j))) > currentHigh)
                {
                    currentHigh = (Integer.parseInt(keyboardPrices.get(i)) + Integer.parseInt(usbPrices.get(j)));
                }
                if (i + j - keyboardPrices.size() - usbPrices.size() == -2)
                {
                    if (currentHigh == 0)
                    {
                        System.out.print(-1);
                        return;
                    }
                    System.out.print(currentHigh);
                    return;
                }
            }
        }
    }
}