package syafa.java.adventofcode.adventofcode2018.day01;
import java.util.*;

public class Part02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HashMap<Long,Long> registeredValues = new HashMap<>();
        ArrayList<Long> inputValues = new ArrayList<>();
        long frequency = 0l;
        while (input.hasNextLine())
        {
            inputValues.add(Long.parseLong(input.nextLine().replace("+","")));
        }
        input.close();
        for (int i = 0; i < args.length; i++)
        {
            
        }
        System.out.println(frequency);
    }
}