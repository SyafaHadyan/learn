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
        "sixteen", "seventeen", "eighteen", "nineteen","twenty"};
        String[] tensNumber = { "", "ten", "twenty",
        "half"};
        if (minute == 0)
        {
            System.out.print(baseNumber[hour % 100] + ' ' + "o' clock");
            return;
        }
        if (minute >= 1 && minute < 30 && minute != 15 && minute != 30)
        {
            if (minute % 100 > 20)
            {
                if (minute >= 20)
                {
                    System.out.print("twenty" + ' ' + baseNumber[(minute - 20) % 100] + ' ' + "minute" + (minute != 1 ? "s " : " ") + "past" + ' ' + baseNumber[hour]);
                    return;
                }
            }
            System.out.print(baseNumber[minute % 100] + ' ' + "minute" + (minute != 1 ? "s " : " ") + "past" + ' ' + baseNumber[hour]);
            return;
        }
        if (minute == 15 || minute == 30)
        {
            System.out.print((minute == 15 ? baseNumber[minute] : "half") + ' ' + "past" + ' ' + baseNumber[hour]);
            return;
        }
        if (minute > 30 && minute <= 59 && minute != 45)
        {
            
            if ((60 - minute) % 100 > 20)
            {
                if ((60 - minute) >= 20)
                {
                    System.out.print("twenty" + ' ' + baseNumber[((60 - minute) - 20) % 100] + ' ' + "minute" + ((60 - minute) != 1 ? "s " : " ") + "past" + ' ' + baseNumber[hour + 1]);
                    return;
                }
            }
            System.out.print(baseNumber[60 - minute] + ' ' + "minute" + ((60 - minute) != 1 ? "s " : " ") +  "to" + ' ' + baseNumber[hour + 1]);
            return;
        }
        if (minute == 45)
        {
            System.out.print("quarter to" + ' ' + baseNumber[hour % 100]);
            return;
        }
    }
}