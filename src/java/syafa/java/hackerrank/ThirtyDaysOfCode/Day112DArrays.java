package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day112DArrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer[][] hourGlass = new Integer[6][6];
        //Integer[] hourGlass1D = new Integer[6];
        for (int i = 0; i < 6; i++)
        {
            //hourGlassArrList.add(Integer.parseInt(Arrays.toString(input.nextLine().split(" "))));
            //Integer hourGlass1D[] = Integer.parseInt(Arrays.toString(input.nextLine().split(" ")));
            ArrayList<String> hourGlassArrList = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
            for (int j = 0; j < 6; j++)
            {
                hourGlass[i][j] = Integer.parseInt(hourGlassArrList.get(j));
            }
        }
        input.close();
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
    }
}