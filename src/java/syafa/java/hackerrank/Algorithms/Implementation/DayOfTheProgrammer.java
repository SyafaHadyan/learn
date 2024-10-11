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
        if (LocalDate.of(year, 01, 01).isLeapYear())
        {
            System.out.print("12.09." + year);
            return;
        }
        System.out.print("13.09." + year);
    }
}