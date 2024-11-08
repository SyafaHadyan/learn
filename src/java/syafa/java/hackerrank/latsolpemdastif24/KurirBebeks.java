package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.math.*;

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
        BigDecimal totalItem = input.nextBigDecimal();
        input.nextLine();
        BigDecimal totalWeight = input.nextBigDecimal();
        input.close();
        if (totalItem.compareTo(BigDecimal.ZERO) <= 0 || totalWeight.compareTo(BigDecimal.ZERO) <= 0)
        {
            exit();
        }
        BigDecimal deliveryCost = BigDecimal.ZERO;
        if (deliveryOption.equalsIgnoreCase("Ekonomi"))
        {
            deliveryCost = BigDecimal.valueOf(10000);
            if (totalWeight.compareTo(BigDecimal.valueOf(15)) <= 15)
            {
                deliveryCost = deliveryCost.add(totalWeight.multiply(BigDecimal.valueOf(3000)));
            }
            else if (totalWeight.compareTo(BigDecimal.valueOf(15)) > 15)
            {
                deliveryCost = deliveryCost.add(BigDecimal.valueOf(15 * 3000)).add((totalWeight.subtract(BigDecimal.valueOf(15))).multiply(BigDecimal.valueOf(4500)));
            }
            if (totalItem.compareTo(BigDecimal.valueOf(6)) > 6)
            {
                deliveryCost = deliveryCost.multiply(BigDecimal.valueOf(0.95));
            }
        }
        else if (deliveryOption.equalsIgnoreCase("Reguler"))
        {
            deliveryCost.add(BigDecimal.valueOf(15000));
            if (totalWeight.compareTo(BigDecimal.valueOf(10)) <= 10)
            {
                deliveryCost = deliveryCost.add(totalWeight.multiply(BigDecimal.valueOf(5000)));
            }
            else if (totalWeight.compareTo(BigDecimal.valueOf(10)) > 10)
            {
                deliveryCost = deliveryCost.add(BigDecimal.valueOf(10 * 5000)).add((totalWeight.subtract(BigDecimal.valueOf(10))).multiply(BigDecimal.valueOf(7000)));
            }
            if (totalItem.compareTo(BigDecimal.valueOf(4)) > 4)
            {
                deliveryCost = deliveryCost.multiply(BigDecimal.valueOf(0.9));
            }
        }
        else if (deliveryOption.equalsIgnoreCase("Kilat"))
        {
            deliveryCost.add(BigDecimal.valueOf(15000));
            if (totalItem.compareTo(BigDecimal.valueOf(2)) < 2)
            {
                exit();
            }
            if (totalWeight.compareTo(BigDecimal.valueOf(10)) <= 10)
            {
                deliveryCost = deliveryCost.add(totalWeight.multiply(BigDecimal.valueOf(9000)));
            }
            else if (totalWeight.compareTo(BigDecimal.valueOf(10)) > 10)
            {
                deliveryCost = deliveryCost.add(BigDecimal.valueOf(10 * 5000)).add((totalWeight.subtract(BigDecimal.valueOf(10))).multiply(BigDecimal.valueOf(11000)));
            }
            if (totalItem.compareTo(BigDecimal.valueOf(4)) > 4)
            {
                deliveryCost = deliveryCost.multiply(BigDecimal.valueOf(0.85));
            }
        }
        else if (deliveryOption.equalsIgnoreCase("SameDay"))
        {
            deliveryCost = 25000;
            /*
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
            */
            /*
             * 3
             * 18
             * 
             * 
             */
            deliveryCost += (totalWeight * 12000);
            if ((double) totalWeight / (double) totalItem > 5d)
            {
                totalWeight -= (5 * totalItem);
                deliveryCost += (totalWeight * 3000);
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
        if (Long.parseLong(String.valueOf(deliveryCost).substring(String.valueOf(deliveryCost).length() - 2,String.valueOf(deliveryCost).length())) >= 50)
        {
            deliveryCost = Long.parseLong((String.valueOf(deliveryCost).substring(0,String.valueOf(deliveryCost).length() - 4)) + (Long.parseLong(String.valueOf(String.valueOf(deliveryCost).charAt(String.valueOf(deliveryCost).length() - 4))) + 1) + "000");
        }
        else if (Long.parseLong(String.valueOf(deliveryCost).substring(String.valueOf(deliveryCost).length() - 2,String.valueOf(deliveryCost).length())) < 50 && Long.parseLong(String.valueOf(deliveryCost).substring(String.valueOf(deliveryCost).length() - 2,String.valueOf(deliveryCost).length())) != 0)
        {
            deliveryCost = Long.parseLong((String.valueOf(deliveryCost).substring(0,String.valueOf(deliveryCost).length() - 4)) + (Long.parseLong(String.valueOf(String.valueOf(deliveryCost).charAt(String.valueOf(deliveryCost).length() - 4))) - 1) + "000");
        }
        System.out.print("Diperlukan biaya pengiriman sebesar" + " " + deliveryCost);
    }
}