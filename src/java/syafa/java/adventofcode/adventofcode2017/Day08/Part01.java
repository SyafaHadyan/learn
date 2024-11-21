package syafa.java.adventofcode.adventofcode2017.Day08;
import java.util.*;

@SuppressWarnings("unused")
public class Part01
{
    static final Map<String,Integer> INSTRUCTION_LIST = Map.ofEntries
    (
        Map.entry("inc",1),
        Map.entry("dec",-1)
    );
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int largestRegister = 0;
        HashMap<String,Integer> register = new HashMap<>();
        while (input.hasNextLine())
        {
            String[] instructionInput = input.nextLine().split("\s");
            register.putIfAbsent(instructionInput[4],0);
        }
        input.close();
    }
}