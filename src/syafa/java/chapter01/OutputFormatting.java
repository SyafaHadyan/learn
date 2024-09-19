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
        input.nextLine();
        input.close();
        String formatted_first_int = String.format("%03d",first_int);
        String divider = "================================";
        System.out.printf("%-15s%s",first_string,formatted_first_int);
    }
}
