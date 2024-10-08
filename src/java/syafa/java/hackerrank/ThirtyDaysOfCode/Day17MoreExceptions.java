package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day17MoreExceptions
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int recursion = Integer.parseInt(input.nextLine());
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < recursion; i++)
        {
            ArrayList<String> number = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
            if ((Integer.parseInt(number.get(0)) < 0) || (Integer.parseInt(number.get(1)) < 0))
        }
        input.close();
    }
}