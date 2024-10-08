package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day112DArrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer[][] hourGlass = new Integer[6][6];
        int hourGlassSum = 0;
        int maxHourGlassSum = 0;
        for (int i = 0; i < 6; i++)
        {
            ArrayList<String> hourGlassArrList = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
            for (int j = 0; j < 6; j++)
            {
                hourGlass[i][j] = Integer.parseInt(hourGlassArrList.get(j));
            }
        }
        input.close();
        // Condition 1
        if (
            hourGlass[0][0] + 
            hourGlass[0][1] + 
            hourGlass[0][2] + 
            hourGlass[1][1] + 
            hourGlass[2][0] + 
            hourGlass[2][1] + 
            hourGlass[2][2] > maxHourGlassSum)
            {
                maxHourGlassSum =
                hourGlass[0][0] + 
                hourGlass[0][1] + 
                hourGlass[0][2] + 
                hourGlass[1][1] + 
                hourGlass[2][0] + 
                hourGlass[2][1] + 
                hourGlass[2][2];
            }
        System.out.print("\n");
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                System.out.print(hourGlass[i][j]);
                if (j != 5)
                {
                    System.out.print(' ');
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n" + maxHourGlassSum);
    }
}