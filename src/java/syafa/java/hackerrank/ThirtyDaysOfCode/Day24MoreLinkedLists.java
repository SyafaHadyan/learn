package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day24MoreLinkedLists
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberLength = Integer.parseInt(input.nextLine());
        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < numberLength; i++)
        {
            number.add(Integer.parseInt(input.nextLine()));
        }
        input.close();
        Collections.sort(number);
        for (int i = 0; i < number.size(); i++)
        {
            try
            {
                //
            }
            catch (IndexOutOfBoundsException e)
            {
                // TODO: handle exception
            }
        }
    }
}