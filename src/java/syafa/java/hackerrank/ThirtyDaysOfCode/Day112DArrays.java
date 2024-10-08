package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day112DArrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer[][] hourGlass = new Integer[6][6];
        ArrayList<Integer> hourGlassArrList = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++)
        {
            hourGlassArrList.add(Integer.parseInt(Arrays.toString(input.nextLine().split(" "))));
            for (int j = 0; j < hourGlass.length; j++)
            {
                hourGlass[i][j] = hourGlassArrList.get(j);
            }
        }
        input.close();
        for (int i = 0; i < hourGlass.length; i++)
        {
            for (int j = 0; j < hourGlass.length; j++)
            {
                System.out.print(hourGlass[i][j]);
                if (j < hourGlass.length)
                {
                    System.out.print(' ');
                }
            }
            System.out.print("\n");
        }
    }
}