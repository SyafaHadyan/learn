package syafa.java.hackerrank.LiveCodingTIFABAB3;
import java.util.*;

public class TankiAir
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int waterTank = 0;
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
            waterTank = Integer.parseInt(input.nextLine());
            if (waterTank == 100)
            {
                result[i] = 0;
                continue;
            }
            if (waterTank > 100)
            {
                if (currentPhase >= 0 && currentPhase <= 4)
                {
                    //
                }
                else if (currentPhase >= 5 && currentPhase <= 9)
                {
                    //
                }
                else if (currentPhase >= 10 && currentPhase <= 14)
                {
                    //
                    if (currentPhase == 14)
                    {
                        currentPhase = 0;
                    }
                }
            }
            if (waterTank < 100)
            {
                //
            }
        }
        input.close();
    }
}