package syafa.java.hackerrank.utp2024.tifc;
import java.util.*;

public class AngkotDengklek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int start = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        int passengerAmount = Integer.parseInt(input.nextLine());
        input.close();
        double incomePassenger = 0d;
        double gasCost = 0d;
        double finalIncome = 0d;
        int currentGas = 20;
        String passenger = "";
        for (int i = 0; i < passengerAmount; i++)
        {
            passenger = input.nextLine();
            if (passenger.equalsIgnoreCase("Dewasa"))
            {
                incomePassenger += 12000;
            }
            else if (passenger.equalsIgnoreCase("Anak kecil"))
            {
                incomePassenger += 8000;
            }
        }
        for (int i = start; i <= end; i++)
        {
            currentGas -= 2;
            if (currentGas == 0 || i == end)
            {
                if (i >= 0 && i <12)
                {
                    gasCost += 11000;
                }
                else if (i >= 12 && i < 18)
                {
                    gasCost += 12000;
                }
                else if (i >= 18 && i < 24)
                {
                    gasCost += 10000;
                }
                currentGas = 20;
            }
        }
        finalIncome = incomePassenger - gasCost;
        System.out.printf("%-28s%-2c%d%c%s","Total jam operasional",':',(start - end),' ',"jam");
    }
}