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
        long currentIterate = 0;
        long currentValue = COUNTER_START;
        while (currentTime < timeRequest)
        {
            currentIterate++;
            currentTime += currentValue;
            currentValue *= COUNTER_INCREASE;
            System.err.println("IT " + currentIterate);
            System.err.println("TM " + currentTime);
            System.err.println("VL " + currentValue);
            System.err.println();
        }
        currentValue /= 2;
        System.err.println("IT " + currentIterate);
        System.err.println("TM " + currentTime);
        System.err.println("VL " + currentValue);
        long result = currentTime - timeRequest + 1;
        System.out.println(result);
    }
}