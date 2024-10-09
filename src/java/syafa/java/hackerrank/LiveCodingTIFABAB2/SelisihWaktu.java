package syafa.java.hackerrank.LiveCodingTIFABAB2;
import java.util.*;

public class SelisihWaktu
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> month = new ArrayList<String>(Arrays.asList("Jan",
        "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
        ArrayList<Integer> monthValue = new ArrayList<Integer>(Arrays.asList(31,
        28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));
        ArrayList<String> firstDate = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> secondDate = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        int day = 1;
        int hour = 0;
        int minute = 0;
        for (int i = 0; i < month.size(); i++)
        {
            day += monthValue.get(i);
            if (secondDate.get(1).equalsIgnoreCase(month.get(i)))
            {
                day += Integer.parseInt(secondDate.get(0));
                for (int j = 0; j < month.size(); j++)
                {
                    day -= monthValue.get(j);
                    if (firstDate.get(1).equalsIgnoreCase(month.get(j)))
                    {
                        day -= Integer.parseInt(firstDate.get(0));
                        if (Integer.parseInt(firstDate.get(0)) == Integer.parseInt(secondDate.get(0)))
                        {
                            day = 0;
                        }
                        break;
                    }
                }
                break;
            }
        }
        minute = (Integer.parseInt(secondDate.get(2)) * 60) + Integer.parseInt(secondDate.get(3)) - (Integer.parseInt(firstDate.get(2)) * 60) - Integer.parseInt(firstDate.get(3));
        if (minute < 0)
        {
            minute += 1440;
            day--;
        }
        hour = minute / 60;
        minute %= 60;
        System.out.print(day + "d " + hour + "h " + minute + "m");
    }
}