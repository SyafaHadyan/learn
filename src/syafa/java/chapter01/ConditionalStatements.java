import java.util.*;

public class ConditionalStatements
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        input.close();
        if (n >= 1 && n <= 100)
        {

        }
        else
        {
            return;
        }
        if (n % 2 == 0)
        {
            if (n >= 2 && n <= 5)
            {
                System.out.print("Not Weird");
            }
            else if (n >= 6 && n <= 20)
            {
                System.out.print("Weird");
            }
            else if (n > 20)
            {
                System.out.print("Not Weird");
            }
        }
        else
        {
            System.out.print("Weird");
        }
    }
}