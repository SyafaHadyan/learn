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
        String[] baseNumber = { "o'clock", "one", "two", "three",
        "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen",
        "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensNumber = { "", "ten", "twenty",
        "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
        "ninety"};
        if (hour % 100 < 20)
        {
            System.out.print(baseNumber[hour % 100] + " ");
        }
        if (minute >= 1 && minute <30)
        {
            System.out.print("past");
        }
    }
}