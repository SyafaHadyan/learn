package syafa.java.section0;
import java.util.*;

public class SLWhileLoops
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        input.close();
        int result = 1;
        while (number >= 1)
        {
            result = result * number;
            number = number - 1;
        }
        System.out.print(result);
    }
}
