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
            day += Integer.parseInt(secondDate.get(0)) + monthValue.get(i);
            if (secondDate.get(1).equalsIgnoreCase(month.get(i)))
            {
                System.out.println(day);
                for (int j = 0; j < month.size(); j++)
                {
                    day -= Integer.parseInt(firstDate.get(0)) + monthValue.get(j);
                    if (firstDate.get(1).equalsIgnoreCase(month.get(j)))
                    {
                        System.out.println(Integer.parseInt(firstDate.get(0)) + monthValue.get(j));
                        break;
                    }
                }
                break;
            }
        }
        System.out.print(day + "d " + hour + "h " + minute + "m");
    }
}