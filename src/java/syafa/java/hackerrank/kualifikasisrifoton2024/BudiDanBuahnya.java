package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;
import java.util.stream.*;

public class BudiDanBuahnya
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        for (int i = 0; i < testCase; i++)
        {
            int[] fruit = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            while (true)
            {
                if (fruit[0] != 0 && fruit[1] != 0)
                {
                    fruit[0]--;
                    fruit[1]--;
                    continue;
                }
                else if (fruit[0] != 0 && fruit[2] != 0)
                {
                    fruit[0]--;
                    fruit[1]--;
                    continue;
                }
                else if (fruit[1] != 0 && fruit[2] != 0)
                {
                    fruit[1]--;
                    fruit[2]--;
                    continue;
                }
                else
                {
                    break;
                }
            }
        }
        input.close();
    }
}