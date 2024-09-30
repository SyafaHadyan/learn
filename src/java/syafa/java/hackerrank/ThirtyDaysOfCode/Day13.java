package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        String author = input.nextLine();
        String price = input.nextLine();
        input.close();
        System.out.printf("%s%c%c%s","Title",':',' ',title);
        System.out.printf("%s%c%c%s","Author",':',' ',author);
        System.out.printf("%s%c%c%s","Price",':',' ',price);
    }
}