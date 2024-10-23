package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;
import java.util.stream.*;

public class BudiDanBuahnya
{
    public static void main(String[] args)
    {
        /*
         * 5
         * 1 1 1
         * 1 2 1
         * 4 1 1
         * 8 5 8
         * 9 4 5
         * 
         * 1
         * 2
         * 2
         * 10
         * 9
         */
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] possibleDays = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int[] fruit = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(fruit);
            int counter = 0;
            while (true)
            {
                Arrays.sort(fruit);
                if (fruit[2] != 0 && fruit[1] != 0)
                {
                    fruit[2]--;
                    fruit[1]--;
                    counter++;
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