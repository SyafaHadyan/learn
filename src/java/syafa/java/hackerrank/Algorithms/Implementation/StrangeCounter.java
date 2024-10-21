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
        for (int i = 1; i < requestTimeValue; i++)
        {
            currentValue--;
            if (currentValue == 1)
            {
                initialValue *= 2;
                currentValue = initialValue - 1;
            }
        }
        System.out.print(currentValue);
    }
}