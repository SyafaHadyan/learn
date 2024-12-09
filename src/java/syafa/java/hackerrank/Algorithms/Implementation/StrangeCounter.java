package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class StrangeCounter
{
    static final long COUNTER_INCREASE = 2l;
    static final long COUNTER_START = 3l;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long timeRequest = Long.parseLong(input.nextLine());
        input.close();
        long currentTime = 0l;
        long currentValue = COUNTER_START;
        while (currentTime < timeRequest)
        {
            currentTime += currentValue;
            currentValue *= COUNTER_INCREASE;
        }
        currentValue /= 2;
        System.out.println(currentTime - timeRequest + 1);
    }
}