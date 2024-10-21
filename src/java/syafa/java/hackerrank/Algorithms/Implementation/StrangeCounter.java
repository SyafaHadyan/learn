package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class StrangeCounter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int requestTimeValue = Integer.parseInt(input.nextLine());
        input.close();
        int initialValue = 3;
        int currentValue = initialValue;
        if (requestTimeValue == 1)
        {
            System.out.print(3);
            return;
        }
        for (int i = 1; i < requestTimeValue; i++)
        {
            currentValue--;
            if (currentValue == 1)
            {
                initialValue *= 2;
                currentValue = initialValue;
                i++;
            }
            if (requestTimeValue - i == 1)
            {
                System.out.print(currentValue);
                return;
            }
        }
        System.out.print(1);
    }
}