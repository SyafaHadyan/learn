package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.time.*;

public class DayOfTheProgrammer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int year = Integer.parseInt(input.nextLine());
        input.close();
        if (LocalDate.of(year, 01, 01).isLeapYear() || year == 1700 || year == 1800 || year == 1900 || year == 1918)
        {
            System.out.print("12.09." + year);
            return;
        }
        System.out.print("13.09." + year);
    }
}