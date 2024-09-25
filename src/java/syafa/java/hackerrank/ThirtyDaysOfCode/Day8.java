package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;
public class Day8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int phoneBookInput = Integer.parseInt(input.nextLine());
        String nameArray[] = new String[phoneBookInput];
        int phoneNumber[] = new int[phoneBookInput];
        for (int i = 1; i <= phoneBookInput; i++)
        {
            String name = input.next();
            int phoneNumber = input.nextInt();
            input.nextLine();
        }
    }
}