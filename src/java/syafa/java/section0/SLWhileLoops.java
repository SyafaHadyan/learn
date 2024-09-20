package syafa.java.section0;
import java.util.*;

public class SLWhileLoops
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int factorial = 1;
        for (int i = 0; i < number; i++)
        {
            number = Integer.parseInt(input.nextLine());
            int factorial_array[] = new int[number];
            factorial_array[i] = i + 1;
            for (int a = 0; a < factorial_array.length; a++)
            {
                factorial = a + 1;
            }
        }
        System.out.println(factorial);
        input.close();
    }
}
