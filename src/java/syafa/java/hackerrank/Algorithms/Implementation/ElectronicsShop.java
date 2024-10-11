package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class ElectronicsShop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> budget = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> keyboardPrices = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> usbPrices = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
    }
}