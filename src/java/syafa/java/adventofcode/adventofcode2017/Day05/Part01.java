package syafa.java.adventofcode.adventofcode2017.Day05;
import java.util.*;

public class Part01
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
        while (true)
        {
            int instructionSet = 0;
            try
            {
                instructionSet = instruction.get(index);
                instruction.set(index,instruction.get(index) + 1);
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.println(step);
            }
        }
    }
}