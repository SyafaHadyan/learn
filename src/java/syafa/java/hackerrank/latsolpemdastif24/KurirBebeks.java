package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class KurirBebeks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String deliveryOption = input.nextLine();
        int totalItem = Integer.parseInt(input.nextLine());
        int totalWeight = Integer.parseInt(input.nextLine());
        input.close();
        if (totalItem <= 0 || totalWeight <= 0)
        {
            System.out.print("Pengiriman tidak dapat dilakukan.");
            System.exit(0);
        }
        int deliveryCost = 0;
        if (deliveryOption.equalsIgnoreCase("Ekonomi"))
        {
            deliveryCost = 10000;
            if (totalWeight <= 15)
            {
                deliveryCost += (totalWeight * 3000);
            }
            else if (totalWeight > 15)
            {
                deliveryCost += (15 * 3000) + ((totalWeight - 15) * 4500);
            }
            if (totalItem > 6)
            {
                deliveryCost *= 0.95;
            }
        }
        else if (deliveryOption.equalsIgnoreCase("Reguler"))
        {
            deliveryCost = 15000;
            if (totalWeight <= 10)
            {
                deliveryCost += (totalWeight * 5000);
            }
            else if (totalWeight > 10)
            {
                deliveryCost += ((10 * 5000) + (totalWeight - 10) * 7000);
            }
            if (totalItem > 4)
            {
                deliveryCost *= 0.9;
            }
        }
        else if (deliveryOption.equalsIgnoreCase("Kilat"))
        {
            //
        }
        else if (deliveryOption.equalsIgnoreCase("SameDay"))
        {
            //
        }
        else
        {
            System.out.print("Pengiriman tidak dapat dilakukan.");
            System.exit(0);
        }
        System.out.print("Diperlukan biaya pengiriman sebesar" + " " + deliveryCost);
    }
}