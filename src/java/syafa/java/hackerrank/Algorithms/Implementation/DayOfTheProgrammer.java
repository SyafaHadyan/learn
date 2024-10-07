package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class DayOfTheProgrammer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int year = Integer.parseInt(input.nextLine());
        input.close();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.print("12.09" + year);
            return;
        }
    }
}