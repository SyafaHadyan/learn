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
                //
            }
            if (waterTank < 100)
            {
                //
            }
        }
        input.close();
    }
}