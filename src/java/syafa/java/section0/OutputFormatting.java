package syafa.java.section0;
import java.util.*;

public class OutputFormatting
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String first_string = input.next();
        int first_int = input.nextInt();
        input.nextLine();
        String second_string = input.next();
        int second_int = input.nextInt();
        input.nextLine();
        String third_string = input.next();
        int third_int = input.nextInt();
        input.close();
        String formatted_first_int = String.format("%03d",first_int);
        String formatted_second_int = String.format("%03d",second_int);
        String formatted_third_int = String.format("%03d",third_int);
        String divider = "================================";
        System.out.printf("%s\n%-15s%s",divider,first_string,formatted_first_int);
        System.out.printf("\n%-15s%s",second_string,formatted_second_int);
        System.out.printf("\n%-15s%s\n%s",third_string,formatted_third_int,divider);
    }
}