package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        String author = input.nextLine();
        int price = Integer.parseInt(input.nextLine());
        input.close();
        System.out.printf("%s%c%c%s\n","Title",':',' ',title);
        System.out.printf("%s%c%c%s\n","Author",':',' ',author);
        System.out.printf("%s%c%c%d","Price",':',' ',price);
    }
}