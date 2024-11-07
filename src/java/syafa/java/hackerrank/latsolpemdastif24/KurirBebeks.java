package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class KurirBebeks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String deliveryOption = input.nextLine();
        int numberOfItems = Integer.parseInt(input.nextLine());
        int totalWeight = Integer.parseInt(input.nextLine());
        if (numberOfItems <= 0 || totalWeight <= 0)
        {
            System.out.print("Pengiriman tidak dapat dilakukan.");
            System.exit(0);
        }
        input.close();
        if (deliveryOption.equalsIgnoreCase("Ekonomi"))
        {
            System.exit(0);
        }
        else if (deliveryOption.equalsIgnoreCase("Reguler"))
        {
            System.exit(0);
        }
        else if (deliveryOption.equalsIgnoreCase("Kilat"))
        {
            System.exit(0);
        }
        else if (deliveryOption.equalsIgnoreCase("SameDay"))
        {
            System.exit(0);
        }
        else
        {
            System.out.print("Pengiriman tidak dapat dilakukan.");
            System.exit(0);
        }
    }
}