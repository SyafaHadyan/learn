package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5EPerpustakaanE
{
    static final long[][] DAY_LATE_COST_INDEX_PRICE =
    {
        {5,1000},
        {10,2000},
        {15,3000},
    };
    static final long DAY_LATE_COST_ABOVE_LIMIT = 500;
    static final long MEMBER_DISCOUNT = 10;
    static final long[] DAY_LATE_COST_LIMIT = {16,4000};

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dayLate = Integer.parseInt(input.nextLine());
        boolean isVIPMember = Boolean.parseBoolean(input.nextLine());
        input.close();
        long dayLateCost = 0;
        for (int i = 1; i <= dayLate; i++)
        {
            if (i < DAY_LATE_COST_LIMIT[0])
            {
                for (int j = 0; j < DAY_LATE_COST_INDEX_PRICE.length - 1; j++)
                {
                    if (i <= DAY_LATE_COST_INDEX_PRICE[j][0])
                    {
                        dayLateCost += DAY_LATE_COST_INDEX_PRICE[j][1];
                        break;
                    }
                }
            }
            else
            {
                dayLateCost += DAY_LATE_COST_LIMIT[1] + DAY_LATE_COST_ABOVE_LIMIT * (i - DAY_LATE_COST_LIMIT[0]);
                System.err.println(DAY_LATE_COST_LIMIT[1] + DAY_LATE_COST_ABOVE_LIMIT * (i - DAY_LATE_COST_LIMIT[0]));
                // System.err.println(((i > DAY_LATE_COST_LIMIT[0]) ? (DAY_LATE_COST_ABOVE_LIMIT * (i - DAY_LATE_COST_LIMIT[0])) : 0) * -1 + DAY_LATE_COST_LIMIT[1]);
                // dayLateCost += ((i > DAY_LATE_COST_LIMIT[0]) ? (DAY_LATE_COST_ABOVE_LIMIT * (i - DAY_LATE_COST_LIMIT[0])) : 0) * -1 + DAY_LATE_COST_LIMIT[1] + DAY_LATE_COST_LIMIT[1];
            }
        }
        System.out.println("Julah hari keterlambatan" + ": " + dayLate);
        System.out.println("Status keanggotaan" + ": " + ((isVIPMember) ? "" : "Bukan ") + "Anggota VIP");
        System.out.println(dayLateCost - ((isVIPMember) ? (MEMBER_DISCOUNT * dayLateCost / 100) : 0));
    }
}