package syafa.java.hackerrank.LiveCodingTIFABAB3;
import java.util.*;

public class TankiAir
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        //int waterTank = 0;
        int[] result = new int[testCase];
        int[] waterTank = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int currentPhase = 0;
        /*
         * phase0 = normal = inc 3
         * phase1 = rain = inc 5
         * phase2 = heat = inc 3
         * 
         * phase0 = normal = dec -4
         * phase1 = rain = dec -4
         * phase2 = heat = dec -6
         */
        for (int i = 0; i < testCase; i++)
        {
            if (waterTank[i] == 100)
            {
                result[i] = 0;
                continue;
            }
            if (waterTank[i] > 100)
            {
                if (currentPhase >= 0 && currentPhase <= 4)
                {
                    waterTank[i] -= 4;
                    currentPhase++;
                    continue;
                }
                else if (currentPhase >= 5 && currentPhase <= 9)
                {
                    waterTank[i] -= 4;
                    currentPhase++;
                }
                else if (currentPhase >= 10 && currentPhase <= 14)
                {
                    waterTank[i] -= 6;
                    if (currentPhase == 14)
                    {
                        currentPhase = 0;
                    }
                }
            }
            if (waterTank[i] < 100)
            {
                //
            }
        }
        input.close();
    }
}