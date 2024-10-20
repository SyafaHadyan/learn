package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class TheTimeInWords
{
    public static void main(String[] args)
    {
        /*
         * string array each contains english word
         * 
         */
        Scanner input = new Scanner(System.in);
        int hour = Integer.parseInt(input.nextLine());
        int minute = Integer.parseInt(input.nextLine());
        input.close();
        String[] baseNumber = { "", "one", "two", "three",
        "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "quarter",
        "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensNumber = { "", "ten", "twenty",
        "half", "forty", "fifty", "sixty", "seventy", "eighty",
        "ninety"};
        if (minute == 0)
        {
            System.out.print(baseNumber[hour % 100] + ' ' + "o' clock");
            return;
        }
        if (minute >= 1 && minute <= 30 && minute != 15 && minute != 30)
        {
            System.out.print(baseNumber[minute % 100] + ' ' + "minute past" + ' ' + baseNumber[hour % 100]);
            return;
        }
        if (minute == 15)
        {
            System.out.print(baseNumber[minute % 100] + ' ' + "past" + ' ' + baseNumber[hour % 100]);
            return;
        }
        if (minute == 30)
        {
            System.out.print(tensNumber[minute % 100 / 10] + ' ' + "past" + ' ' + baseNumber[hour % 100]);
            return;
        }
        if (minute > 30 && minute <= 59 && minute != 45)
        {
            String minuteWord = "";
            if (minute % 100 < 2)
            {
                minuteWord = baseNumber[(60 - minute) % 100];
                minute /= 100;
            }
            else
            {
                minuteWord = tensNumber[(60 - minute) % 10];
                minute /= 10;
                minuteWord = tensNumber[(60 - minute) % 10] + minuteWord;
            }
            System.out.print(minuteWord + ' ' + "minutes to" + ' ' + baseNumber[(hour + 1) % 100]);
        }
    }
}