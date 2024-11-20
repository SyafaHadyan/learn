package syafa.java.adventofcode.adventofcode2017.Day06;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] memoryBlock = Stream.of(input.nextLine().split("\s++")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int distributionLoop = 1;
        HashMap<String,Boolean> memoryBlockDistribution = new HashMap<>();
        while (true)
        {
            int[] choosenBlock = {0,0};
            for (int i = 0; i < memoryBlock.length; i++)
            {
                if (memoryBlock[i] > choosenBlock[1])
                {
                    choosenBlock[0] = i;
                    choosenBlock[1] = memoryBlock[i];
                }
            }
            for (int i = 0; i < memoryBlock.length; i++)
            {
                if (i != choosenBlock[0])
                {
                    memoryBlock[i] += memoryBlock[choosenBlock[0]] / (memoryBlock.length - 1);
                }
            }
            memoryBlock[choosenBlock[0]] = memoryBlock[choosenBlock[0]] % (memoryBlock.length - 1);
            if (memoryBlockDistribution.get(Arrays.toString(memoryBlock)) == null)
            {
                memoryBlockDistribution.put(Arrays.toString(memoryBlock),true);
                distributionLoop++;
                continue;
            }
            else
            {
                System.out.println(distributionLoop);
                return;
            }
        }
    }
}