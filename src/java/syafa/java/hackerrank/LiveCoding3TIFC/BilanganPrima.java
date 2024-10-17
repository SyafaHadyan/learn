package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class BilanganPrima
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        int counter = 0;
        if (number == 2)
        {
            System.out.print(number + " merupakan bilangan prima ke 1");
            return;
        }
        for (int i = 2; i <= number; i++)
        {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    prime = false;
                    break;
                }
            }
            if (prime)
            {
                counter++;
            }
        }
        System.out.print(number + " merupakan bilangan prima ke " + counter);
    }
}