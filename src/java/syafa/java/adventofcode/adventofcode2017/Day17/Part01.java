package syafa.java.adventofcode.adventofcode2017.Day17;
import java.util.*;

public class Part01
{
    static final int SPINLOCK_CYCLE = 3;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int operationLookup = Integer.parseInt(input.nextLine());
        input.close();
        ArrayList<Integer> spinlock = new ArrayList<>();
        spinlock.add(0);
        System.err.println(spinlock);
        for (int i = 1, previousIndex = 1; i <= operationLookup; i++)
        {
            int nextIndex = previousIndex;
            for (int j = 0; j < SPINLOCK_CYCLE; j++)
            {
                ++nextIndex;
                if (nextIndex >= spinlock.size())
                {
                    nextIndex = 0;
                }
            }
            nextIndex++;
            previousIndex = nextIndex;
            spinlock.add(nextIndex,i);
            System.err.println(spinlock);
        }
        System.err.println(spinlock);
    }
}