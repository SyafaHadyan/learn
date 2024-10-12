package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day26NestedLogic
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> dateReturn = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> dateDue = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
        int lateCount = 0;
        input.close();
        if (Integer.parseInt(dateReturn.get(0)) > Integer.parseInt(dateDue.get(0)) &&
        Integer.parseInt(dateReturn.get(1)) == Integer.parseInt(dateDue.get(1)) &&
        Integer.parseInt(dateReturn.get(2)) == Integer.parseInt(dateDue.get(2)))
        {
            //
        }
    }
}