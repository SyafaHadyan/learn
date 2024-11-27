package syafa.java.eling.remedialutp2024;
import java.util.Scanner;

public class AngkotDengklek
{
    static final long ADULT_TICKET_COST = 12000;
    static final long CHILD_TICKET_COST = 8000;
    static final int GAS_TANK = 20;
    static final long GAS_CONSUMPTION = 2;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hourStart = input.nextInt(); input.nextLine();
        int hourEnd = input.nextInt(); input.nextLine();
        int passengerAmount = input.nextInt(); input.nextLine();
        int currentGasTank = GAS_TANK;
        int adultPassengerCounter = 0;
        int childPassengerCounter = 0;
        long currentIncome = 0;
        long gasCost = 0;
        long finalIncome = 0;
        for (int i = 0; i < passengerAmount; i++)
        {
            System.err.println(i);
            if (input.nextLine().equalsIgnoreCase("Dewasa"))
            {
                System.err.println("AD");
                currentIncome += ADULT_TICKET_COST;
                adultPassengerCounter++;
            }
            else
            {
                System.err.println("CD");
                currentIncome += CHILD_TICKET_COST;
                childPassengerCounter++;
            }
            System.err.println("AD " + adultPassengerCounter + " CD " + childPassengerCounter);
            System.err.println("CRINC " + currentIncome + "\n");
        }
        input.close();
        for (int i = hourStart + 1; i <= hourEnd; i++)
        {
            currentGasTank -= GAS_CONSUMPTION;
            if (currentGasTank == 0 || i == hourEnd)
            {
                System.err.println(i);
                if (i <= 11)
                {
                    System.err.println("CGC " + gasCost);
                    gasCost += 10000 * (GAS_TANK - currentGasTank);
                }
                else if (i <= 17)
                {
                    System.err.println("CGC " + gasCost);
                    gasCost += 12000 * (GAS_TANK - currentGasTank);
                }
                else if (i <= 23)
                {
                    System.err.println("CGC " + gasCost);
                    gasCost += 11000 * (GAS_TANK - currentGasTank);
                }
                System.err.println("GCA " + gasCost + "\n");
                currentGasTank = GAS_TANK;
            }
        }
        finalIncome = currentIncome - gasCost;
        System.out.printf("%-28s%-2c%d %s\n","Durasi operasi",':',(hourEnd - hourStart),"jam");
        System.out.printf("%-28s%-2c%d %s\n","Jumlah penumpang dewasa",':',(adultPassengerCounter),"orang");
        System.out.printf("%-28s%-2c%d %s\n","Jumlah penumpang anak kecil",':',(childPassengerCounter),"orang");
        System.out.printf("%-28s%-2c%s%d%c%d%s\n","Total pendapatan",':',"Rp",(currentIncome),'.',(00),",-");
        System.out.printf("%-28s%-2c%s%d%c%d%s\n","Pengeluaran bensin",':',"Rp",(gasCost),'.',(00),",-");
        System.out.print("Pak Dengklek " + ((finalIncome < 0) ? "mengalami kerugian" : "mendapat keuntungan") +  " sebesar " + ((finalIncome < 0) ? finalIncome * -1 : finalIncome) + ".00,-");
    }
}