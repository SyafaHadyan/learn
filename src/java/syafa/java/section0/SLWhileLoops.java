package syafa.java.section0;
import java.util.*;

public class SLWhileLoops
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int factorial;
        int factorial_array[] = new int[number - 1];
        for (int i = 0; i < number; i++)
        {
            number = Integer.parseInt(input.nextLine());
            factorial_array[i] = i + 1;
        }
        for (int i = 0; i < factorial_array.length; i++)
        {
            factorial = i + 1;
        }
        System.out.println(factorial);
        input.close();
    }
}
