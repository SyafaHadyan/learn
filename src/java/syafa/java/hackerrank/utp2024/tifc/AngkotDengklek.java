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
        double finalCost = 0d;
        int currentGas = 0;
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
    }
}