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
        long currentIncome = 0;
        for (int i = 0; i < passengerAmount; i++)
        {
            System.err.println(i);
            if (input.nextLine().equalsIgnoreCase("Dewasa"))
            {
                System.err.println("AD");
                currentIncome += ADULT_TICKET_COST;
            }
            else
            {
                System.err.println("CD");
                currentIncome += CHILD_TICKET_COST;
            }
            System.err.println("CRINC " + currentIncome + "\n");
        }
        input.close();
    }
}