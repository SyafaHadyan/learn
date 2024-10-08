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
            hourGlass[i][] = Integer.parseInt(Arrays.toString(input.nextLine().split(" ")));
        }
        input.close();
    }
}