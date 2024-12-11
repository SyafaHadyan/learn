package syafa.java.eling.uap2024;
import java.util.*;

public class DataPekerja
{
    static final int MIN_WORK_HOUR = 8;
    static final int MAX_WORK_HOUR = 12;
    static final long HOUR_SALARY = 15000;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int workerAmount = input.nextInt();
        int dayAmount = input.nextInt(); input.nextLine();
        int[] workHour = new int[workerAmount];
        long[] salary = new long[workerAmount];
        for (int i = 0; i < workerAmount; i++)
        {
            for (int j = 0; j < dayAmount; j++)
            {
                workHour[i] = input.nextInt();
            }
            input.nextLine();
        }
        input.close();
    }
}