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
                if (number.get(i) == number.get(i + 1))
                {
                    number.remove(i);
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
        for (int i = 0; i < number.size(); i++)
        {
            System.out.print(number.get(i));
            if (i != number.size() - 1)
            {
                System.out.print(' ');
            }
        }
    }
}