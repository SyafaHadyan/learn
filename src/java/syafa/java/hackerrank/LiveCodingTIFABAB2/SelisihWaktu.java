package syafa.java.hackerrank.LiveCodingTIFABAB2;
import java.util.*;

public class SelisihWaktu
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> month = new ArrayList<String>(Arrays.asList("Jan",
                                                                        "Feb",
                                                                        "Mar",
                                                                        "Apr",
                                                                        "May",
                                                                        "Jun",
                                                                        "Jul",
                                                                        "Aug",
                                                                        "Sep",
                                                                        "Oct",
                                                                        "Nov",
                                                                        "Dec"));
        ArrayList<Integer> monthValue = new ArrayList<Integer>(Arrays.asList(31,
                                                                                28,
                                                                                31,
                                                                                30,
                                                                                31,
                                                                                30,
                                                                                31,
                                                                                31,
                                                                                30,
                                                                                31,
                                                                                30,
                                                                                31));
        ArrayList<String> firstDate = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> secondDate = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        int day = 0;
        int hour = 0;
        int minute = 0;
        for (int i = 0; i < month.size(); i++)
        {
            if (firstDate.get(1).equalsIgnoreCase(month.get(i)))
            {
                day = Integer.parseInt(firstDate.get(1)) + monthValue.get(i);
                for (int j = 0; j < month.size(); j++)
                {
                    if (secondDate.get(1).equalsIgnoreCase(month.get(i)))
                    {
                        day -= Math.abs(Integer.parseInt(secondDate.get(1)) + monthValue.get(i));
                        break;
                    }
                }
                break;
            }
        }
    }
}