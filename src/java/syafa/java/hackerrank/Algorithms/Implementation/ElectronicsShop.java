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
        Collections.sort(keyboardPricesString);
        Collections.sort(usbPricesString);
    }
}