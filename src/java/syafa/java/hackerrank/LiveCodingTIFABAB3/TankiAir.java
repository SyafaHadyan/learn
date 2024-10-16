package syafa.java.hackerrank.LiveCodingTIFABAB3;
import java.util.*;

public class TankiAir
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        //int waterTank = 0;
        int[] waterTank = new int[testCase];
        int[] result = new int[testCase];
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
            waterTank[i] = Integer.parseInt(input.nextLine());
        }
        for (int i = 0; i < waterTank.length; i++)
        {
            if (waterTank[i] == 100)
            {
                if (result[i] == 0)
                {
                    continue;
                }
                result[i] = result[i] + 1;
                continue;
            }
            if (waterTank[i] > 100)
            {
                if (currentPhase >= 0 && currentPhase <= 4)
                {
                    waterTank[i] -= 4;
                    result[i] = result[i] + 1;
                    currentPhase++;
                    i--;
                    continue;
                }
                else if (currentPhase >= 5 && currentPhase <= 9)
                {
                    waterTank[i] -= 4;
                    result[i] = result[i] + 1;
                    currentPhase++;
                    i--;
                    continue;
                }
                else if (currentPhase >= 10 && currentPhase <= 14)
                {
                    waterTank[i] -= 6;
                    result[i] = result[i] + 1;
                    if (currentPhase == 14)
                    {
                        currentPhase = 0;
                        i--;
                        continue;
                    }
                }
            }
            if (waterTank[i] < 100)
            {
                if (currentPhase >= 0 && currentPhase <= 4)
                {
                    waterTank[i] += 3;
                    result[i] = result[i] + 1;
                    currentPhase++;
                    i--;
                    continue;
                }
                else if (currentPhase >= 5 && currentPhase <= 9)
                {
                    waterTank[i] += 5;
                    result[i] = result[i] + 1;
                    currentPhase++;
                    i--;
                    continue;
                }
                else if (currentPhase >= 10 && currentPhase <= 14)
                {
                    waterTank[i] += 3;
                    result[i] = result[i] + 1;
                    if (currentPhase == 14)
                    {
                        currentPhase = 0;
                        i--;
                        continue;
                    }
                }
            }
        }
        input.close();
        Arrays.stream(result).forEach(System.out::println);;
    }
}