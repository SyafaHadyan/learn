package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class KurirBebeks
{
    public static void exit()
    {
        System.out.print("Pengiriman tidak dapat dilakukan.");
        System.exit(0);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String deliveryOption = input.nextLine();
        int totalItem = Integer.parseInt(input.nextLine());
        int totalWeight = Integer.parseInt(input.nextLine());
        input.close();
        if (totalItem <= 0 || totalWeight <= 0)
        {
            exit();
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
            deliveryCost = 15000;
            if (totalItem < 2)
            {
                exit();
            }
            if (totalWeight <= 10)
            {
                deliveryCost += (totalWeight * 9000);
            }
            else if (totalWeight > 10)
            {
                deliveryCost += ((10 * 5000) + (totalWeight - 10) + 11000);
            }
            if (totalItem > 4)
            {
                deliveryCost *= 0.85;
            }
        }
        else if (deliveryOption.equalsIgnoreCase("SameDay"))
        {
            deliveryCost = 25000;
            if (totalWeight <= 5)
            {
                deliveryCost += (totalWeight * 12000);
            }
            else if (totalWeight > 5)
            {
                deliveryCost += ((5 * 12000) + (totalWeight - 5) * 15000);
            }
            if (totalItem > 3)
            {
                deliveryCost *= 0.8;
            }
        }
        else
        {
            exit();
        }
        /*
         * 123450 menjadi 123500
         * 123449 menjadi 123400
         * 73950
         * 74000
         */
        if (Integer.parseInt(String.valueOf(deliveryCost).substring(String.valueOf(deliveryCost).length() - 2,String.valueOf(deliveryCost).length())) >= 50)
        {
            deliveryCost = Integer.parseInt((String.valueOf(deliveryCost).substring(0,String.valueOf(deliveryCost).length() - 4)) + (Integer.parseInt(String.valueOf(String.valueOf(deliveryCost).charAt(String.valueOf(deliveryCost).length() - 4))) + 1) + "000");
        }
        else if (Integer.parseInt(String.valueOf(deliveryCost).substring(String.valueOf(deliveryCost).length() - 2,String.valueOf(deliveryCost).length())) < 50 && Integer.parseInt(String.valueOf(deliveryCost).substring(String.valueOf(deliveryCost).length() - 2,String.valueOf(deliveryCost).length())) != 0)
        {
            deliveryCost = Integer.parseInt((String.valueOf(deliveryCost).substring(0,String.valueOf(deliveryCost).length() - 4)) + (Integer.parseInt(String.valueOf(String.valueOf(deliveryCost).charAt(String.valueOf(deliveryCost).length() - 4))) - 1) + "000");
        }
        System.out.print("Diperlukan biaya pengiriman sebesar" + " " + deliveryCost);
    }
}