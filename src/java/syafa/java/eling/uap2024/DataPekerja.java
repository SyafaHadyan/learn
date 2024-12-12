package syafa.java.eling.uap2024;
import java.util.*;

public class DataPekerja
{
    static final int MIN_WORK_HOUR = 8;
    static final int MAX_WORK_HOUR = 12;
    static final int BELOW_MINIMUM_REDUCE_PERCENTAGE = 50;
    static final int OVERTIME_BONUS_PERCENTAGE = 50;
    static final int BEST_WORKER_BONUS_PERCENTAGE = 10;
    static final double HOUR_SALARY = 15000d;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int workerAmount = input.nextInt();
        int dayAmount = input.nextInt(); input.nextLine();
        int bestWorker = 0;
        int mostHour = 0;
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
            if (workHour[i] > MAX_WORK_HOUR * dayAmount)
            {
                salary[i] += ((workHour[i] - (MAX_WORK_HOUR * dayAmount)) * (HOUR_SALARY * OVERTIME_BONUS_PERCENTAGE / 100));
            }
            if (workHour[i] > mostHour)
            {
                mostHour = workHour[i];
                bestWorker = i;
            }
        }
        input.close();
        double bonusSalary = (salary[bestWorker] * BEST_WORKER_BONUS_PERCENTAGE / 100);
        for (int i = 0; i < workerAmount; i++)
        {
            System.out.println("Tukang Bangunan " + (i + 1) + ":");
            System.out.println("- Total jam kerja: " + workHour[i] + " jam");
            System.out.printf("%s%.1f\n","- Gaji: Rp ",salary[i]);
        }
        System.out.println("\n" + "Pekerja terbaik: Tukang Bangunan " + (bestWorker + 1));
        System.out.printf("%s%.1f\n","Bonus tambahan: Rp ",bonusSalary);
        System.out.printf("%s%d%s%.1f\n","Total Gaji yang diterima Tukang Bangunan ",(bestWorker + 1),": Rp ",(bonusSalary + salary[bestWorker]));
    }
}