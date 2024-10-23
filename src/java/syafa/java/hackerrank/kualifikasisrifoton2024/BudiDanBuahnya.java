package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;
import java.util.stream.*;

public class BudiDanBuahnya
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] possibleDays = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int[] fruit = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int counter = 0;
            while (true)
            {
                if (fruit[0] != 0 && fruit[1] != 0)
                {
                    fruit[0]--;
                    fruit[1]--;
                    counter++;
                    continue;
                }
                else if (fruit[0] != 0 && fruit[2] != 0)
                {
                    fruit[0]--;
                    fruit[2]--;
                    counter++;
                    continue;
                }
                else if (fruit[1] != 0 && fruit[2] != 0)
                {
                    fruit[1]--;
                    fruit[2]--;
                    counter++;
                    continue;
                }
                else
                {
                    possibleDays[i] = counter;
                    counter = 0;
                    break;
                }
            }
        }
        input.close();
        for (int i = 0; i < possibleDays.length; i++)
        {
            System.out.print(possibleDays[i]);
            if (possibleDays.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}