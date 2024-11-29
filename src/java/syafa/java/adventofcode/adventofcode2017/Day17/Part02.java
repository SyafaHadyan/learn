package syafa.java.adventofcode.adventofcode2017.Day17;
import java.util.*;

public class Part02
{
    static final long SPINLOCK_CYCLE = 50000000;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long operationLookup = Long.parseLong(input.nextLine());
        input.close();
        ArrayList<Long> spinlock = new ArrayList<>();
        spinlock.add(0l);
        long previousIndex = 1;
        System.err.println(spinlock);
        for (long i = 1; i <= SPINLOCK_CYCLE; i++)
        {
            long nextIndex = previousIndex;
            for (long j = 0; j < operationLookup; j++)
            {
                ++nextIndex;
                if (nextIndex >= spinlock.size())
                {
                    nextIndex = 0;
                }
            }
            nextIndex++;
            previousIndex = nextIndex;
            spinlock.add((int) nextIndex,i);
            System.err.println(spinlock);
        }
        System.out.println(spinlock.get(1));
    }
}