package syafa.java.eling.uap2024;
import java.util.*;

public class DataPekerja
{
    static final int MIN_WORK_HOUR = 8;
    static final int MAX_WORK_HOUR = 12;
    static final int BELOW_MINIMUM_REDUCE_PERCENTAGE = 50;
    static final double HOUR_SALARY = 15000d;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int workerAmount = input.nextInt();
        int dayAmount = input.nextInt(); input.nextLine();
        int[] workHour = new int[workerAmount];
        double[] salary = new double[workerAmount];
        for (int i = 0; i < workerAmount; i++)
        {
            for (int j = 0; j < dayAmount; j++)
            {
                workHour[i] += input.nextInt();
            }
            if (workerAmount - i != 1)
            {
                input.nextLine();
            }
            salary[i] = HOUR_SALARY * workHour[i];
            if (workHour[i] < MIN_WORK_HOUR * dayAmount)
            {
                salary[i] -= (((MIN_WORK_HOUR * dayAmount) - workHour[i]) * (HOUR_SALARY * BELOW_MINIMUM_REDUCE_PERCENTAGE / 100));
            }
        }
        input.close();
        /* 
         * 270000
         * 18 h (-6)
         * 8 * 3 = 24 - 18 = 6
         */
        for (int i = 0; i < workerAmount; i++)
        {
            System.out.println("Tukang Bangunan " + (i + 1) + ":");
            System.out.println("- Total jam kerja: " + workHour[i] + " jam");
            System.out.printf("%s%.1f\n","- Gaji: Rp ",salary[i]);
        }
    }
}