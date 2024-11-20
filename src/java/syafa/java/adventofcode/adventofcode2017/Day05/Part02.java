package syafa.java.adventofcode.adventofcode2017.Day05;
import java.util.*;

public class Part02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> instruction = new ArrayList<>();
        int step = 0;
        while (input.hasNextLine())
        {
            instruction.add(Integer.parseInt(input.nextLine()));
        }
        input.close();
        int index = 0;
        int previousIndex = 0;
        while (true)
        {
            try
            {
                step++;
                instruction.set(previousIndex,instruction.get(previousIndex) + ((instruction.get(previousIndex) < 3) ? 1 : -1));
                previousIndex += index;
                index = instruction.get(previousIndex);
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.println(step);
                return;
            }
        }
    }
}