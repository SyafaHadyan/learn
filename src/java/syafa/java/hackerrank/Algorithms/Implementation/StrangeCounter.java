package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class StrangeCounter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double requestTimeValue = Double.parseDouble(input.nextLine());
        input.close();
        double initialValue = 3;
        double currentValue = initialValue;
        if (requestTimeValue == 1)
        {
            System.out.print(3);
            return;
        }
        for (double i = 1; i < requestTimeValue; i++)
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
                System.out.printf("%.0f",currentValue);
                return;
            }
        }
        System.out.print(1);
    }
}