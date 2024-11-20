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
        HashMap<String,Boolean> memoryBlockDistribution = new HashMap<>;
        while (true)
        {
            int choosenBlock = 0;
            for (int i = 0; i < memoryBlock.length; i++)
            {
                if (memoryBlock[i] > choosenBlock)
                {
                    choosenBlock = i;
                }
            }
            for (int i = 0; i < memoryBlock.length; i++)
            {
                if (i != choosenBlock)
                {
                    memoryBlock[i] += memoryBlock[choosenBlock] / (memoryBlock.length - 1);
                }
                else
                {
                    memoryBlock[i] = memoryBlock[i] % (memoryBlock.length - 1);
                }
            }
        }
    }
}