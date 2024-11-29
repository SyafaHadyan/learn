package syafa.java.adventofcode.adventofcode2017.Day17;
import java.util.*;

public class Part01
{
    static final int SPINLOCK = 3;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int operationLookup = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = 0; i < operationLookup; i++)
        {
            for (int j = i; j < i + SPINLOCK; j++)
            {
                //
            }
        }
    }
}