package syafa.java.adventofcode.adventofcode2018.day01;
import java.util.*;

public class Part02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HashMap<Long,Integer> registeredValues = new HashMap<>();
        ArrayList<Long> inputValues = new ArrayList<>();
        long frequency = 0l;
        while (input.hasNextLine())
        {
            inputValues.add(Long.parseLong(input.nextLine().replace("+","")));
        }
        input.close();
        while (true)
        {
            for (int i = 0; i < inputValues.size(); i++)
            {
                frequency += inputValues.get(i);
                if (!(registeredValues.containsKey(frequency)))
                {
                    registeredValues.put(frequency,i);
                    continue;
                }
                System.out.println(frequency);
                System.exit(0);
            }
        }
    }
}