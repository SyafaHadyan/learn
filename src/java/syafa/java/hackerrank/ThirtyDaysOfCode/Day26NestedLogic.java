package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day26NestedLogic
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> dateReturn = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> dateDue = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        if ((Integer.parseInt(dateReturn.get(0)) > Integer.parseInt(dateDue.get(0))) &&
        (Integer.parseInt(dateReturn.get(1)) == Integer.parseInt(dateDue.get(1))) &&
        (Integer.parseInt(dateReturn.get(2)) == Integer.parseInt(dateDue.get(2))))
        {
            System.out.print(15 * (Integer.parseInt(dateReturn.get(0)) - Integer.parseInt(dateDue.get(0))));
            return;
        }
        else if ((Integer.parseInt(dateReturn.get(1)) != Integer.parseInt(dateDue.get(1))) &&
        (Integer.parseInt(dateReturn.get(2)) == Integer.parseInt(dateDue.get(2))))
        {
            System.out.print(500 * (Integer.parseInt(dateReturn.get(1)) - Integer.parseInt(dateDue.get(1))));
            return;
        }
        if ((Integer.parseInt(dateReturn.get(0)) <= Integer.parseInt(dateDue.get(0))) ||
        (Integer.parseInt(dateReturn.get(1)) <= Integer.parseInt(dateDue.get(1))) ||
        (Integer.parseInt(dateReturn.get(2)) <= Integer.parseInt(dateDue.get(2))))
        {
            System.out.print(0);
            return;
        }
        System.out.print(10000);
    }
}