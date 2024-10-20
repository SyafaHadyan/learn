package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class TheTimeInWords
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hour = Integer.parseInt(input.nextLine());
        int minute = Integer.parseInt(input.nextLine());
        input.close();
        String[] baseNumber = { "", "one", "two", "three",
        "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "quarter",
        "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensNumber = { "", "ten", "twenty",
        "half"};
        if (minute == 0)
        {
            System.out.print(baseNumber[hour % 100] + ' ' + "o' clock");
            return;
        }
        if (minute >= 1 && minute < 30 && minute != 15 && minute != 30)
        {
            System.out.print(baseNumber[minute % 100] + ' ' + "minute past" + ' ' + baseNumber[hour]);
            return;
        }
        if (minute == 15)
        {
            System.out.print(baseNumber[minute] + ' ' + "past" + ' ' + baseNumber[hour]);
            return;
        }
        if (minute == 30)
        {
            System.out.print("half" + ' ' + "past" + ' ' + baseNumber[hour]);
            return;
        }
        // ill fix later
        if (minute > 30 && minute <= 59 && minute != 45)
        {
            minute -= 60;
            System.out.print(baseNumber[minute] + ' ' + "minutes to" + ' ' + baseNumber[(hour % 12) + 1]);
        }
        if (minute == 45)
        {
            System.out.print("quarter to" + ' ' + baseNumber[hour % 100]);
        }
    }
}