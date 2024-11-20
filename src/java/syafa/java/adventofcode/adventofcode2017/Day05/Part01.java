package syafa.java.adventofcode.adventofcode2017.Day05;
import java.util.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> instruction = new ArrayList<>();
        int step = 0;
        int tempCount = 0;
        while (tempCount < 5)
        {
            instruction.add(Integer.parseInt(input.nextLine()));
            tempCount++;
        }
        input.close();
        int index = 0;
        int previousIndex = 0;
        while (true)
        {
            try
            {
                step++;
                instruction.set(previousIndex,instruction.get(previousIndex) + 1);
                previousIndex = instruction.get(previousIndex);
                System.out.println(instruction);
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.println(step);
                return;
            }
        }
    }
}