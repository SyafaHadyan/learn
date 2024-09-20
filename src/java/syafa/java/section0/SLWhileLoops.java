package syafa.java.section0;
import java.util.*;

public class SLWhileLoops
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        input.close();
        while (number >= 1)
        {
            int factorial = number;
            int result = number * number - 1;
            number = number - 1;
        }
    }
}
