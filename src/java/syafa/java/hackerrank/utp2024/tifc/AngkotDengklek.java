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
        double incomePassenger = 0d;
        double gasCost = 0d;
        double finalIncome = 0d;
        int currentGas = 20;
        int adultPassenger = 0;
        int kidPassenger = 0;
        String passenger = "";
        String incomeValidity = "";
        for (int i = 0; i < passengerAmount; i++)
        {
            passenger = input.nextLine();
            if (passenger.equalsIgnoreCase("Dewasa"))
            {
                incomePassenger += 12000;
                adultPassenger++;
            }
            else if (passenger.equalsIgnoreCase("Anak kecil"))
            {
                incomePassenger += 8000;
                kidPassenger++;
            }
        }
        input.close();
        for (int i = start; i <= end; i++)
        {
            currentGas -= 2;
            if (currentGas == 0 || i == end)
            {
                if (i >= 0 && i <12)
                {
                    gasCost += (20 - currentGas) * 11000;
                }
                else if (i >= 12 && i < 18)
                {
                    gasCost += (20 - currentGas) * 12000;
                }
                else if (i >= 18 && i < 24)
                {
                    gasCost += (20 - currentGas) * 10000;
                }
                currentGas = 20;
            }
        }
        finalIncome = incomePassenger - gasCost;
        incomeValidity = "Mendapatkan keuntungan sebesar";
        if (finalIncome < 0)
        {
            incomeValidity = "Mendapatkan kerugian sebesar";
        }
        System.out.printf("%-28s%-2c%d%c%s\n","Total jam operasional",':',(end - start),' ',"jam");
        System.out.printf("%-28s%-2c%d%c%s\n","Total penumpang dewasa",':',adultPassenger,' ',"orang");
        System.out.printf("%-28s%-2c%d%c%s\n","Total penumpang anak-anak",':',kidPassenger,' ',"orang");
        System.out.printf("%-28s%-2c%-3s%.2f%s\n","Total pemasukan penumpang",':',"Rp",incomePassenger,".-");
        System.out.printf("%-28s%-2c%-3s%.2f%s\n","Total pengeluaran bensin",':',"Rp",gasCost,".-");
        System.out.printf("%-28s%-2c%-3s%.2f%s",incomeValidity,':',"Rp",Math.abs(finalIncome),".-");
    }
}