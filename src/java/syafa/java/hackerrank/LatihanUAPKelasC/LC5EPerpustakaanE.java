package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5EPerpustakaanE
{
    static final long[][] DAY_LATE_COST_INDEX_PRICE =
    {
        {5,1000},
        {10,2000},
        {15,3000},
        {16,4000}
    };
    static final long DAY_LATE_COST_ABOVE_LIMIT = 500;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dayLate = Integer.parseInt(input.nextLine());
        boolean isVIPMember = Boolean.parseBoolean(input.nextLine());
        input.close();
        long dayLateCost = 0;
        for (int i = 1; i <= dayLate; i++)
        {
            if (i < DAY_LATE_COST_INDEX_PRICE[3][0])
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
                dayLateCost += ((i > DAY_LATE_COST_INDEX_PRICE[3][0]) ? (DAY_LATE_COST_ABOVE_LIMIT * (DAY_LATE_COST_INDEX_PRICE[3][0] - i)) : 0);
            }
        }
    }
}